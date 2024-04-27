import java.util.Scanner;

public class Calculator {

    // Main method where your program execution begins
    public static void main(String[] args) {
       MainCalculator();
    }


    public static void MainCalculator(){
        double num_1 = 0;
        double num_2 = 1;

        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select an operator (+, -, /, *) = ");
        String operator = scanner.nextLine();
        

        Boolean OperatorCheck = false;

        while (OperatorCheck != true) {
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                OperatorCheck = false;
                System.out.println("Not a valid operator, try again");
                System.out.print("Please select an operator (+, -, /, *) = ");
                operator = scanner.nextLine();

            } else {
                OperatorCheck = true;
                continue;
            }
        }
        

        System.out.print("What is the first number = ");
        num_1 = scanner.nextDouble();

        System.out.print("What is the second number = ");
        num_2 = scanner.nextDouble();


        switch (operator) {
            case "+":
                result = num_1 + num_2;
                System.out.println(num_1 + " + " + num_2 + " = " + result);
                System.out.println("The result is = " + result);
                break;
            
            case "-":
                result = num_1 - num_2;
                System.out.println(num_1 + " - " + num_2 + " = " + result);
                System.out.println("The result is = " + result);
                break;

            case "/":
                result = num_1 / num_2;
                System.out.println(num_1 + " / " + num_2 + " = " + result);
                System.out.println("The result is = " + result);
                break;

            case "*":
                result = num_1 * num_2;
                System.out.println(num_1 + " x " + num_2 + " = " + result);
                System.out.println("The result is = " + result);
                break;
        
            default:
                break;
        }

        ContinueOrEnd();
    }


    public static void ContinueOrEnd() {
        Scanner scanner = new Scanner(System.in);
        int choice = 2;
        System.out.println("Would you like to quit(0) or do another calculation(1)");
        System.out.print("Please select 0 or 1 = ");
        choice = scanner.nextInt();
        if (choice == 0) {
            System.out.print("Thank you and goodbye");
            System.exit(0);
        }
        else if(choice == 1){
            MainCalculator();
        }
        else{
            System.out.println("Invalid Choice!");
            System.out.print("Please select 0 or 1 = ");
            choice = scanner.nextInt();
        }
    }

}
