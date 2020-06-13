package com.mapstruct.demo.domain;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE) //Hides the constructor to force usage of the Builder.
@ToString
public class CustomerDto {

    private long customerId;
    private String firstName;
    private String lastName;
    private double creditScore;
    private String dob;
    private String title;
    private AddressDto address;
    private String fullName;
}
