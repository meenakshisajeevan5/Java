package Day3;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
      Map map = new HashMap();
      map.put("1","Dona");
      map.put("2","Harry");
      map.put("3","Dan");
      map.put("4","Anna");

      MapActivity activity = new MapActivity();
      activity.print(map);
    }

    void print(Map map) {
        for(Object key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

    }
}
