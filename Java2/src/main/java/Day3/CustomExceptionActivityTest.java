package Day3;

public class CustomExceptionActivityTest {
    public static void main(String[] args){
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        try {
            obj.validateUser("John");
        } catch (CustomExceptionActivity e){
            System.out.println(e.getMessage());
        }
        try {
            obj.validateUser("Rahul");
        } catch (CustomExceptionActivity e){
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        // Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (validUsers[i].equals(name)){
                flag = 1;
            }
        }

        if(flag ==0){
            throw new CustomExceptionActivity();
        }
        else {
            System.out.println("Welcome to payroll program");
        }

    }
}