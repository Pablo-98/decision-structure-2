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

        System.out.println("enter temp bro");

        int temp = input.nextInt();

        if (temp >= 80){
            System.out.println("wear shorts dawg, its hot");
        }


    }
}