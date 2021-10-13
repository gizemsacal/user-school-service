package com.example.userschoolservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {


@Id
    Integer id;

    @Max(20)
    String username;
    @Max(20)
    String firstName;
    @Max(20)
    String lastName;
    @Email
    @Max(20)
    String email;
    Date birthDay;


    @ManyToOne
    @JoinColumn(name = "school_id")
    School school;
}
