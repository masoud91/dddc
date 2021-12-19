package com.github.masoud91.dddc.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CustomerTest {

    @Test
    void createCustomerSuccessfully() {
        Email email = Email.of("me@joordaroo.com");

        Customer customer = new Customer();
        customer.setEmail(email);

        assertThat(customer.getEmail()).isEqualTo(email);
    }

}
