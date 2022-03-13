package com.ersin.hrms.business.abstracts;

import com.ersin.hrms.entities.concretes.Job_seekers;

import java.util.List;

public interface JobSeekersService {
    List<Job_seekers> getALL();
}
