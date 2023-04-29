package com.geekster.UserManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @NotNull
    private int UserId;
    @NotEmpty(message = "name cant be empty")
    private String Name;
    @Email@NotEmpty
    private String UserName;
    private String Address;
    @Size(min = 10,max = 12)
    private String PhoneNumber;


}
