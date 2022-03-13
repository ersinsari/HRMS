package com.ersin.hrms.api;

import com.ersin.hrms.business.abstracts.JobSeekersService;
import com.ersin.hrms.entities.concretes.Job_seekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobSeekersControll {
    private JobSeekersService jobSeekersService;

    @Autowired
    public JobSeekersControll(JobSeekersService jobSeekersService) {
        this.jobSeekersService = jobSeekersService;
    }
    @GetMapping("/jobseekers")
    List<Job_seekers> getALL(){
        return this.jobSeekersService.getALL();
    }
}
