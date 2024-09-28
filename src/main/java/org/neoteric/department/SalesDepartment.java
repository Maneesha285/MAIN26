package org.neoteric.department;

import org.neoteric.employee.Employee;

import java.util.List;

public class SalesDepartment {
    private String departmentName;
    private List<Employee> employees;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
