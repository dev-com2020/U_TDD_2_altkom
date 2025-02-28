package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class UserServiceTesst {

    @Test
    void shouldReturnUserName(){
        UserRepository mockRepository = mock(UserRepository.class);
        when(mockRepository.findUserById(1)).thenReturn("Tomek");

        UserService userService = new UserService(mockRepository);

        Assertions.assertThat(userService.getUserName(1)).isEqualTo("Tomek");

        verify(mockRepository, times(1)).findUserById(1);
    }
}
