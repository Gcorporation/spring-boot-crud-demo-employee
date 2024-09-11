package com.gcorporation.cruddemo.dao;

import com.gcorporation.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
