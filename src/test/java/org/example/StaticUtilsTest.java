package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mockStatic;

public class StaticUtilsTest {

    @Test
    void shouldReturnMockedRange(){
        assertThat(StaticUtils.range(2,6)).containsExactly(2,3,4,5);

        try (MockedStatic<StaticUtils> mockedStatic = mockStatic(StaticUtils.class)){
            mockedStatic.when(() -> StaticUtils.range(2,6)).thenReturn(Arrays.asList(11,12,13));

            assertThat(StaticUtils.range(2,6)).containsExactly(11,12,13);
        }
        assertThat(StaticUtils.range(2,6)).containsExactly(2,3,4,5);
    }
    @Test
    void givenStaticMethod_whenMocked_thenReturnMockSuccess(){

        try (MockedStatic<StaticUtils> utils = mockStatic(StaticUtils.class)){
            utils.when(StaticUtils::name).thenReturn("Tomek");

            assertThat(StaticUtils.name()).isEqualTo("Tomek");
            utils.verify(StaticUtils::name);
        }
    }
    @Test
    void shouldReturnCorrectRange(){
        List<Integer> result = StaticUtils.range(3,6);
        assertThat(result).containsExactly(3,4,5);
    }
}
