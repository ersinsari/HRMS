package com.ersin.hrms.dataAccess.abstracts;

import com.ersin.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployersDao extends JpaRepository<Employers,Long> {
}
