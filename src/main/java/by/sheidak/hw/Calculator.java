package by.sheidak.hw;

import by.sheidak.hw.service.Calculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Calculation calculation;
    private Console console;
    private boolean isContinue;

    @Autowired
    public Calculator(Calculation calculation, Console console) {
        this.calculation = calculation;
        this.console = console;
    }

    public Calculator() {}

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }


    public void run(){
        do {
            System.out.println("Choose type of operation");
            showMenu1();
            int yourChoice = console.getInt();

            System.out.println("Enter num1: ");
            double num1 = console.getDouble();
            System.out.println("Enter num2: ");
            double num2 = console.getDouble();

            System.out.println("Result: " + calculation.getResult(num1, num2, yourChoice));

            continueOrNot();
        }while(isContinue);
    }

    private void continueOrNot(){
        isContinue = true;
        System.out.println("Do you want to continue?");
        showMenu2();
        int decision = console.getInt();
        if (decision == 2){
            isContinue = false;
        }
    }

    private void showMenu1(){
        System.out.println("addition - 1");
        System.out.println("subtraction - 2");
        System.out.println("multiplication - 3");
        System.out.println("division - 4");
    }

    private void showMenu2(){
        System.out.println("Yes - 1");
        System.out.println("No - 2");
    }
}
