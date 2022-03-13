package com.ersin.hrms.api;

import com.ersin.hrms.business.abstracts.EmployerService;
import com.ersin.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployerControl {
    private EmployerService employerService;

    @Autowired
    public EmployerControl(EmployerService employerService){
        this.employerService=employerService;
    }
    @GetMapping("/Employer")
    List<Employers> getALL(){
        return this.employerService.getALL();
    }
}
