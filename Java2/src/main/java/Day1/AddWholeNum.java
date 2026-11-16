package Day1;

public class AddWholeNum {
    public static void main(String[] args){
        int sum = 0;
        // Add all whole numbers from 50 to 100
        for(int i = 50; i <= 100; i++){
            sum = sum + i;
        }
        // Print result
        System.out.println("Sum of 50 to 100: " + sum);
    }
}
