package com.ersin.hrms.business.concretes;

import com.ersin.hrms.business.abstracts.StaffService;
import com.ersin.hrms.dataAccess.abstracts.StaffDao;
import com.ersin.hrms.entities.concretes.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffManager implements StaffService {
    private StaffDao staffDao;
    @Autowired
    public StaffManager(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public List<Staff> getALL() {
        return this.staffDao.findAll();
    }
}
