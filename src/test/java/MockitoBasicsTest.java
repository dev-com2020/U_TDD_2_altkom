import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

public class MockitoBasicsTest {

    @Test
    void shouldReturnMockedValue(){
//        Tworzę mock
        List<String> mockedList = mock(List.class);
//        defincja zachowania mocka
        when(mockedList.size()).thenReturn(5);
//        sprawdzenie
        assertThat(mockedList.size()).isEqualTo(5);
    }

    @Test
    void shouldVerifyMethodCall(){
        List<String> mockedList = mock(List.class);
        mockedList.add("Tomek");
//        mockedList.add("Tomek");

//        verify(mockedList).add("Tomek");
        verify(mockedList, times(1)).add("Tomek");
        verify(mockedList, never()).clear();
    }

    @Test
    void shouldThrowException(){
        List<String> mockedList = mock(List.class);
        when(mockedList.get(0)).thenThrow(new IndexOutOfBoundsException("Brak elementu"));

        assertThatThrownBy(()-> mockedList.get(0))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("Brak elementu");
    }
}
