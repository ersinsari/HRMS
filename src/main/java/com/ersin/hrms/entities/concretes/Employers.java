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
@Table(name ="employers")
public class Employers extends Users {
    @Column(name ="user_id")
    private long userId;

    @Column(name ="company_name")
    private String companyName;

    @Column(name ="web_site")
    private String webSite;

    @Column(name ="phone")
    private String phone;
}
