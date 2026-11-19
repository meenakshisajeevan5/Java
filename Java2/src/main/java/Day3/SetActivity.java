package Day3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {

        Set names = new HashSet();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");
        names.add("Harry");
        names.add("Daniel");
        names.add("Sam");

        print(names);
    }

    static void print(Set set) {
        for(Iterator it = set.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

    }
}
