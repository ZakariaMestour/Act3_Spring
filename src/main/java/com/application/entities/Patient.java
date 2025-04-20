package com.application.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotEmpty @Size(min = 2, max = 15)
    String firstName;
    @NotEmpty @Size(min = 2, max = 15)
    String lastName;
    @NotEmpty
    @Pattern(regexp = "Male|Female",message =  "Gender must be either 'Male' or 'Female'")
    String gender;
    @Pattern(regexp = "^0(6|5|7)\\d{8}$\n")
    String phoneNumber;
    @Email
    String email;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birthDate;
    @NotEmpty
    Boolean malade;
    @Override
    public String toString() {
        return "Patient{id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", malade=" + malade + '}';
    }

    public Long getId() {
        return id;
    }

    public @NotEmpty @Size(min = 2, max = 15) String getFirstName() {
        return firstName;
    }

    public @NotEmpty @Size(min = 2, max = 15) String getLastName() {
        return lastName;
    }

    public @NotEmpty @Pattern(regexp = "Male|Female", message = "Gender must be either 'Male' or 'Female'") String getGender() {
        return gender;
    }

    public @Pattern(regexp = "^0(6|5|7)\\d{8}$\n") String getPhoneNumber() {
        return phoneNumber;
    }

    public @Email String getEmail() {
        return email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public @NotEmpty Boolean getMalade() {
        return malade;
    }
}
