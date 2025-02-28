package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class SpyExampleTest {
    @Test
    void shouldSpyOnRealList(){
        List<String> list = new ArrayList<>();
        List<String> spyList = spy(list);

        spyList.add("Tomek");
        spyList.add("Alicja");

        assertThat(spyList).containsExactly("Tomek","Alicja");

        when(spyList.size()).thenReturn(100);

        assertThat(spyList.size()).isEqualTo(100);

        verify(spyList).add("Alicja");
    }
}
