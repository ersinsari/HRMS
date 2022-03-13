package com.ersin.hrms.entities.concretes;

import com.ersin.hrms.entities.abstracts.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
public class Job_seekers extends Users {
    @Column(name ="user_id")
    private long userId;

    @Column(name ="first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name ="identification_number")
    private String identificationNumber;

    @Column(name ="birth_date")
    private String birthDate;
}
