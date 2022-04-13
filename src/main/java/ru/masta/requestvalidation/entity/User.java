package ru.masta.requestvalidation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_TBL")
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Data

public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String number;
    private String gender;
    private int age;
    private String nationality;

}
