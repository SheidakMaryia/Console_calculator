package by.sheidak.hw;

import by.sheidak.hw.service.Calculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Calculation calculation;
    private ConsoleReader consoleReader;
    private boolean isContinue;

    @Autowired
    public Calculator(Calculation calculation, ConsoleReader consoleReader) {
        this.calculation = calculation;
        this.consoleReader = consoleReader;
    }

    public Calculator() {}

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public ConsoleReader getConsole() {
        return consoleReader;
    }

    public void setConsole(ConsoleReader consoleReader) {
        this.consoleReader = consoleReader;
    }


    public void run(){
        do {

            ConsoleWriter.consoleWriter(ConsoleWriter.CHOOSE_OPERATION);
            showMenu1();
            int yourChoice = consoleReader.getInt();

            ConsoleWriter.consoleWriter(ConsoleWriter.NUM1);
            double num1 = consoleReader.getDouble();
            ConsoleWriter.consoleWriter(ConsoleWriter.NUM2);
            double num2 = consoleReader.getDouble();

            ConsoleWriter.consoleWriter(ConsoleWriter.RESULT);
            System.out.println(calculation.getResult(num1, num2, yourChoice));//???

            continueOrNot();
        }while(isContinue);
    }

    private void continueOrNot(){
        isContinue = true;
        ConsoleWriter.consoleWriter(ConsoleWriter.CONTINUE);
        showMenu2();
        int decision = consoleReader.getInt();
        if (decision == 2){
            isContinue = false;
        }
    }

    private void showMenu1(){
        ConsoleWriter.consoleWriter(ConsoleWriter.ADDITION);
        ConsoleWriter.consoleWriter(ConsoleWriter.SUBTRACTION);
        ConsoleWriter.consoleWriter(ConsoleWriter.SUBTRACTION);
        ConsoleWriter.consoleWriter(ConsoleWriter.DIVISION);
    }

    private void showMenu2(){
        ConsoleWriter.consoleWriter(ConsoleWriter.YES);
        ConsoleWriter.consoleWriter(ConsoleWriter.NO);
    }

}
