
package variablesandstuff;

import java.util.Scanner;

public class VariablesAndStuff {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("What is your name boy? " );
        String name = input.nextLine();
     System.out.print("Tell me that age: ");
        int age = input.nextInt();
     System.out.print("What is your occupation: ");
        String job = input.next();
     System.out.print("Are you a male: ");
        boolean male = input.nextBoolean();
        String female = "not";
        female = male ? "He" : "She";

        
     
     
     System.out.printf("%s is here. And %s is %d years young. And his job is a %s.\n", name, female, age, job);
      
    }
    
}
