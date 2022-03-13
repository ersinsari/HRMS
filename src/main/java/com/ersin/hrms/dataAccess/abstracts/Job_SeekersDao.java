package com.ersin.hrms.dataAccess.abstracts;

import com.ersin.hrms.entities.concretes.Job_seekers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Job_SeekersDao extends JpaRepository<Job_seekers,Long> {
}
