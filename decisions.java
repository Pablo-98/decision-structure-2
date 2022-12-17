import java.util.Scanner;

public class decisions {

    // we need a process that allows us to check multiple conditions
    // if we find the case we are looking for, we shall terminate the search
    

    //the else if statements allows us to check a condition in case previous conditiions are false

    // the nested if statements allows us to "group" multiple conditions within one main if-statement
    

    // logic errors might occur if the execution flow is not properly stated

    public static void main (String[] args) {

        //first we need to setup our scanner
        Scanner input = new Scanner(System.in);
        
        // question for user
        System.out.println("enter temp bro");

        // allows user to input an int 
        int temp = input.nextInt();

        // using multiple conditions here, else if statements are meant to be used when multiple conditions can be met. 
        
        // when doing an else/if statement with integers, use the greatest value first
        // use the greatest value first because Java reads the statements in order.
        if (temp >= 110){
            System.out.println("do not go outside bruh");
        } else if( temp >= 80) {
            System.out.println("wear some mf shorts bruh ");
        } else if( temp <= 30) {
            System.out.println("its not worth it yo...");
        } else {
            System.out.println("wear shorts");
        }


    }
}