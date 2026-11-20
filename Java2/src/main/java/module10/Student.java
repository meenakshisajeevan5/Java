package module10;

public class Student extends Person{

    // Attribute
    private String schoolName;

    public Student(String name, int age, String schoolName){
        super(name, age);
        this.schoolName = schoolName;
    }
    // Getters and Setters
    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    @Override
    public void introduce(){
        System.out.println("I am study in university " + schoolName);
    }
}
