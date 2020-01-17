package com.company.app.dao;
import java.util.List;

import com.company.app.model.EmployeeVO;
 
public interface EmployeeDAO 
{
    public List<EmployeeVO> getAllEmployees();
}