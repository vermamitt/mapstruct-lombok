package com.mapstruct.demo;

import com.mapstruct.demo.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class DemoApplicationTests {

    CustomerMapper customerMapper;

    @BeforeEach
    void setUp() {
        customerMapper = Mappers.getMapper(CustomerMapper.class);
    }

    @Test
    void should_map_customer_to_customer_dto() {
        Customer customer = Customer.builder()
                .id(123)
                .firstName("Tom")
                .lastName("Hank")
                .creditScore(new BigDecimal(9))
                .title(new Title("Business"))
                .dateOfBirth(LocalDate.of(1993, 8, 11))
                .address(new Address("Sydney"))
                .customerType(new CustomerType("Regular"))
                .build();

        CustomerDto customerDto = customerMapper.customerToDto(customer);

        assertThat(customerDto.getCustomerId()).isEqualTo(123L);

    }
}

