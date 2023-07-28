package com.geekster.musicstreamingserviceapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotNull(message = "Username is Required")
    private String username;
    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid email format")
    private String userEmail;
    @NotBlank(message = "Password is Required")
    private String password;
    @Pattern(regexp = "\\d{2}\\d{10}", message = "Phone number should be in the format CCXXXXXXXXXX")
    private String phoneNumber;


}
