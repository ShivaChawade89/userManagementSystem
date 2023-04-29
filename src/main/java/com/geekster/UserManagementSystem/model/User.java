package com.geekster.UserManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @NotNull
    private int UserId;

    @NotEmpty
    private String UserName;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Email
    private String email;

    @Size(min = 10,max = 12)
    private String PhoneNumber;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    @DateTimeFormat(pattern = "hh:mm:ss")
    private LocalTime time;


}
