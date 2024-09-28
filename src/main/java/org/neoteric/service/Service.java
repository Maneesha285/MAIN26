package org.neoteric.service;

import org.neoteric.department.SalesDepartment;
import org.neoteric.employee.Employee;

public class Service {

    public static void main(String args[]){
        SalesDepartment departmentname=new SalesDepartment();
        departmentname.setDepartmentName("neoteric");

        Employee employee1 = new Employee();
        employee1.name="maneesha";
        employee1.id="4567";
        employee1.department="hr";
        employee1.salary="5678";

        System.out.println(employee1.name);
        System.out.println(employee1.id);
        System.out.println(employee1.salary);
        System.out.println(employee1.department);

        Employee employee2=new Employee();
        employee2.name="mani";
        employee2.id="56789";
        employee2.department="teaching";
        employee2.salary="987654";

        System.out.println(employee2.name);
        System.out.println(employee2.id);
        System.out.println(employee2.department);
        System.out.println(employee2.salary);

    }

}
