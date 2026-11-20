package module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args){

        //CREATE 5 EMPLOYEE OBJECTS
        Employee e1 = new Employee("Leena", 26, "Developer", "Google", 35000);
        Employee e2 = new Employee("Dena", 25, "Tester", "Amazon", 28000);
        Employee e3 = new Employee("Rahul", 34, "Manager", "TCS", 75000);
        Employee e4 = new Employee("Anu", 28, "Designer", "Adobe", 31000);
        Employee e5 = new Employee("Tom", 38, "Analyst", "IBM", 43000);

        // CREATE LIST
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        //PRINT THE HIGHEST
        System.out.println("The Employee whose salary is the highest is : " + e1.getHighestPaidEmp(empList));

    }
}
