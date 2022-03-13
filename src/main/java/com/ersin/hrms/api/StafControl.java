package com.ersin.hrms.api;

import com.ersin.hrms.business.abstracts.StaffService;
import com.ersin.hrms.entities.concretes.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StafControl {
    private StaffService staffService;

    @Autowired
    public StafControl(StaffService staffService) {
        this.staffService = staffService;
    }
    @GetMapping("/staff")
    List<Staff> getALL(){
        return this.staffService.getALL();
    }
}
