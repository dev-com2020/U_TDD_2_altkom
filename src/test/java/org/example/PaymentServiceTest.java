package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

class PaymentServiceTest {

    @Test
    void shouldValidatePositiveAmount() {
        PaymentService paymentService = new PaymentService();
        assertThat(paymentService.processPayment(100)).isTrue();
        assertThat(paymentService.processPayment(-100)).isFalse();
    }

    @Test
    void shouldMockPrivateMethod() throws Exception {
        PaymentService spyService = spy(new PaymentService());
        doReturn(false).when(spyService).processPayment(100);
        assert !spyService.processPayment(100);
    }
}