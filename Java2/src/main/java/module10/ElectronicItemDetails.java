package module10;

import java.util.HashMap;

public class ElectronicItemDetails {

    //CREATE HASHMAP
    static HashMap<String, Double> itemHashMap = new HashMap<String, Double>();

    // CREATE METHOD THAT RETURN PRICE
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name){
        return itemHashMap.get(name);
    }
    public static void main(String[] args){
        //ADD 4 ITEMS
        itemHashMap.put("TV", 26000.0);
        itemHashMap.put("Refrigerator", 35000.0);
        itemHashMap.put("Washing Machine", 27000.0);
        itemHashMap.put("Laptop", 54000.0);

        //PRINT PRICE OF TV
        ElectronicItemDetails details = new ElectronicItemDetails();
        System.out.println("Price of TV is " + details.returnPriceOfItem(itemHashMap, "TV"));
    }
}
