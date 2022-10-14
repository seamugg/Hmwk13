import java.util.HashMap;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.Map;


//Declare a HashMap with Integer values for Street Numbers & String values for Names:
//(1000, Liam), (1001, Noah), (1002, Olivia), (1003, Emma), (1004, Benjamin), (1005, Evelyn),  (1006, Lucas)
//Find the name of the person who lives at 1004 based on the street number
//Next, print out all the odd number streets and its corresponding names

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> streetName = new HashMap<Integer, String>();
        streetName.put(1000, "Liam");
        streetName.put(1001, "Noah");
        streetName.put(1002, "Olivia");
        streetName.put(1003, "Emma");
        streetName.put(1004, "Benjamin");
        streetName.put(1005, "Evelyn");
        streetName.put(1006, "Lucas");

        System.out.println(streetName.get(1004));

        for (Integer n : streetName.keySet()){
            if(n % 2 != 0){
                System.out.println(n + " " + streetName.get(n));
            }
        }



    }

}