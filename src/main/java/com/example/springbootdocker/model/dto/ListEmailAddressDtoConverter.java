package com.example.springbootdocker.model.dto;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.util.List;
import java.util.stream.Collectors;

public class ListEmailAddressDtoConverter extends StdConverter<List<EmailAddressDto>, List<String>> {
    @Override
    public List<String> convert(List<EmailAddressDto> emailAddresses) {
        return emailAddresses.stream().map(EmailAddressDto::getEmailaddress).collect(Collectors.toList());
    }
}
