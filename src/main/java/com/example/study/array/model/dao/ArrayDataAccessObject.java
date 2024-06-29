package com.example.study.array.model.dao;

import com.example.study.company.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArrayDataAccessObject {
    List<Employee> arrayList(Employee employee);
}
