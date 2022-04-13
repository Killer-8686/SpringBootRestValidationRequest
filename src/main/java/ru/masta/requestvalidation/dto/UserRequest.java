package ru.masta.requestvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {

    @NotNull(message = "username shouldn`t bu null")
    private String name;
    @Email(message = "email invalid")
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
    private String number;

    private String gender;
    @Min(18)
    @Max(80)
    private int age;
    @NotBlank
    private String nationality;
}
