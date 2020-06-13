package com.mapstruct.demo.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE) //Hides the constructor to force usage of the Builder.
public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private Title title;
    private LocalDate dateOfBirth;
    private BigDecimal creditScore;
    private CustomerType customerType;
    private Address address;
}
