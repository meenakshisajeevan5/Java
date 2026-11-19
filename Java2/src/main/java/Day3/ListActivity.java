package Day3;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        // Add "John", "John", "Harry", and "Daniel" to the list.
        List names = new ArrayList();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");

        print(names);

    }

    static void print(List list) {
        for (int i =0; i < list.size();i++){
            System.out.println(list.get(i));
        }

    }
}