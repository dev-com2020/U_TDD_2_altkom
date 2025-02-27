import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pitest.functional.predicate.Or;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class UserServiceTestWithAnnot {

    @Mock
    private UserRepository mockRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnUserName(){
        when(mockRepository.findUserById(1)).thenReturn("Tomek");
        assertThat(userService.getUserName(1)).isEqualTo("Tomek");
        verify(mockRepository, times(1)).findUserById(1);
    }
    @Test
    void shouldUseMatchers(){
        when(mockRepository.findUserById(anyInt())).thenReturn("Nieznany user");
        assertThat(mockRepository.findUserById(999)).isEqualTo("Nieznany user");
        verify(mockRepository, times(1)).findUserById(anyInt());
    }

    @Test
    void shouldMatchOnlySpecificArg(){

        InventoryService inventoryService = mock(InventoryService.class);
        OrderService orderService = new OrderService(inventoryService);

        when(inventoryService.isProductAvailable(eq("Laptop"), anyInt())).thenReturn(true);
        assertThat(orderService.placeOrder("Laptop",3)).isEqualTo("Order placed for 3 x Laptop");
        assertThat(orderService.placeOrder("Laptop",34)).isEqualTo("Order placed for 34 x Laptop");
    }

}
