package com.ersin.hrms.business.concretes;

import com.ersin.hrms.business.abstracts.EmployerService;
import com.ersin.hrms.dataAccess.abstracts.EmployersDao;
import com.ersin.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {
    private EmployersDao employersDao;
    @Autowired
    public EmployerManager(EmployersDao employersDao) {
        this.employersDao = employersDao;
    }
    @Override
    public List<Employers> getALL() {
        return this.employersDao.findAll();
    }
}
