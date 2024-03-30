package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class Employee {

    @Builder.Default
    private String firstName="firstName";
    @Builder.Default
    private String lastName="lastName";
    private LocalDate birthday;
    private String email;
    private String password;
    private String address,address2;
    private String city;
    private String state;
    private String zipCode;

}
