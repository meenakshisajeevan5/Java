package Day1;

public class FindInArray {
    public static void main(String[] args){
        //Array
        int[] num = { 15, 8, 100, 3};

        int largest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println("Largest number: " + largest);
    }
}
