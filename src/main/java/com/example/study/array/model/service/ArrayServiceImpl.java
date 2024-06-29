package com.example.study.array.model.service;

import com.example.study.array.model.dao.ArrayDataAccessObject;
import com.example.study.company.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrayServiceImpl implements ArrayService {
    @Autowired
    private ArrayDataAccessObject arrayDataAccessObject;

    @Override
    public List<Employee> arrayList(Employee employee){
        return arrayDataAccessObject.arrayList(employee);
    };
}
