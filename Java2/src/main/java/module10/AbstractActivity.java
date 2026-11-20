package module10;

public class AbstractActivity {
    public static void main(String[] args){

        //call introduce from employee
        Employee employee = new Employee("Aan", 26, "Developer", "Google",3500);
        employee.introduce();

        //call introduce from student
        Student student = new Student("Jobin", 21, "Hardvard");
        student.introduce();
    }
}
