package com.mapstruct.demo.domain;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {AddressMapper.class})
public interface CustomerMapper {

    @Mapping(target = "customerId", source = "id")
    @Mapping(target = "dob", source = "dateOfBirth", dateFormat = "dd.MM.yyyy")
    @Mapping(target = "fullName", expression = "java(customer.getFirstName() + customer.getLastName())")
    CustomerDto customerToDto(Customer customer);

    default String toString(Title title) {
        return title.toString();
    }
}
