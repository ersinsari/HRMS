package com.ersin.hrms.dataAccess.abstracts;

import com.ersin.hrms.entities.concretes.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<Staff,Long> {
}
