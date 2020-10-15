import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;


public class Array {
    

    ArrayList<Integer> newArray = new ArrayList<Integer>();


    //methods

    public void run() {

        int sum = 0;
        int product = 1;

        
        
        

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please type in five numbers.");

        newArray.add(userInput.nextInt());
        newArray.add(userInput.nextInt());
        newArray.add(userInput.nextInt());
        newArray.add(userInput.nextInt());
        newArray.add(userInput.nextInt());

        // int num1 = userInput.nextInt();
        // int num2 = userInput.nextInt();
        // int num3 = userInput.nextInt();
        // int num4 = userInput.nextInt();
        // int num5 = userInput.nextInt();

        System.out.println(newArray);

        System.out.println("Take a guess on the sum of these numbers, don't worry, I'll tell you.");

        userInput.nextInt();

        int min = newArray.get(0);
        int max = newArray.get(0);
        
        for (int num : newArray) {
            sum += num; // sum = sum + num
        }

        for (int num : newArray) {
            product *= num;
        }

        for (int i = 0; i < newArray.size(); i++) {
            if(newArray.get(i) >= max) {
                max = newArray.get(i);
            }
        }

        for (int i = 0; i < newArray.size(); i++) {
            if(newArray.get(i) <= min) {
                min = newArray.get(i);
            }
        }


        // for (int i = 1; i < newArray.size(); i++) {
        //     if(newArray.get(i) < min) {
        //         min = newArray.get(i);
        //     } else if(newArray.get(i) > max) {
        //         max = newArray.get(i);
        //     } else {
        //         System.out.println("Nah");
        //     }
        // }
        // Object maxValue = Collections.max(newArray);
        // Object minValue = Collections.min(newArray);
        
    

        System.out.println("The sum of your array list is " + sum);

        System.out.println("The product of your array list is " + product);

        System.out.println("The largest number is " + max);

        System.out.println("The smallest number is " + min);

        








    }





}