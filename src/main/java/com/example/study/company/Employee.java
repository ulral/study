package com.example.study.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * 직원
 */
@Data
@Alias("Employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    Integer empNo = 0;
    String birthDate = "";
    String firstName = "";
    String lastName = "";
    String gender = "";
    String hireDate = "";
}
