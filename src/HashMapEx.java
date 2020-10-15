import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
    
    HashMap<String, String> cars = new HashMap<>();

    

    public void run() {

        Scanner userInput = new Scanner(System.in);
        

                //(key, value)
        cars.put("Camry", "Toyota");
        cars.put("F100", "Ford");
        cars.put("Ram", "Dodge");
        cars.put("Accord", "Honda");

        System.out.println("Hello, what car model are you looking for today?");

        String input = userInput.nextLine();
        
        String output = cars.get(input);

        if(input.equals("Camry")) {
            System.out.println("Great! You can find that particular vehicle in the " + output + " section.");
        } else if(input.equals("F100")) {
            System.out.println("Great! You can find that particular vehicle in the " + output + " section.");
        } else if(input.equals("Ram")) {
            System.out.println("Great! You can find that particular vehicle in the " + output + " section.");
        } else if(input.equals("Accord")) {
            System.out.println("Great! You can find that particular vehicle in the " + output + " section.");
        } else {
            System.out.println("Sorry we don't carry that particular vehicle.");
        }

        
    

        // for (Map.Entry<String, String> iterator : cars.entrySet()) {
        //     String key = iterator.getKey();
        //     String value = iterator.getValue();
        //     System.out.println("Oh, you're looking for a " + value +" "+ key + "! Right over here.");
        // }

        

        





    }



}