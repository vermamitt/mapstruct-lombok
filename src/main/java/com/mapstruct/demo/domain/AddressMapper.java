package com.mapstruct.demo.domain;

import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressDto addressToDto(Address address);
}
