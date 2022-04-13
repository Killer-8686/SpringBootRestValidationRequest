package ru.masta.requestvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {

    private String name;
    private String email;
    private String number;
    private String gender;
    private int age;
    private String nationality;
}
