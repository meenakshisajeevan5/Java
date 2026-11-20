package module10;

import java.util.List;

public class Employee extends Person {
  // Attributes
    private String jobTitle;
    private String company;
    private double salary;

 // Different constructors
    public Employee(String name, int age){
     super(name,age);
    }
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
        // Add getters and setters
        public String getJobTitle(){
            return jobTitle;
        }
        public String getCompany(){
            return company;
        }
        public void setCompany(String company){
            this.company = company;
        }
        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
        // override introduce method of Person class
        @Override
         public void introduce(){
            System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
            System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
        }
        // FOR activity 4
    public static String getHighestPaidEmp(List<Employee> list){
        String name = "";
        double max = 0;
        for (Employee e : list){
            if(e.getSalary() > max){
                max = e.getSalary();
                name = e.getName();
            }
        }
        return name;
    }

}

