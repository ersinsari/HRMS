package com.ersin.hrms.business.concretes;

import com.ersin.hrms.business.abstracts.JobSeekersService;
import com.ersin.hrms.dataAccess.abstracts.Job_SeekersDao;
import com.ersin.hrms.entities.concretes.Job_seekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekersManager implements JobSeekersService {
    private Job_SeekersDao job_seekersDao;
    @Autowired
    public JobSeekersManager(Job_SeekersDao job_seekersDao) {
        this.job_seekersDao = job_seekersDao;
    }
    @Override
    public List<Job_seekers> getALL() {
        return this.job_seekersDao.findAll();
    }
}
