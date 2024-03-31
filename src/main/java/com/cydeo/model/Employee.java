package com.cydeo.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

//    @Builder.Default
//    private String firstName="default_FirstName";
//    @Builder.Default
//    private String lastName="default_LastName";

//   @NotNull  //"" will accept everything except null value
//   @NotEmpty // will not accept null also "" but will accept " "
//   @NotBlank //will not accept null, "", and " "

    @NotBlank
    @Size(max=12,min=2)
    private String firstName;
    @NotBlank
    @Size(max=12,min=2)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String address,address2;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String zipCode;

}
