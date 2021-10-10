package by.sheidak.hw;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    private final Scanner sc = new Scanner(System.in);

    public double getDouble(){
        if (sc.hasNextDouble()){
            double number = sc.nextDouble();
            sc.nextLine();
            return number;
        }
        System.out.println("Enter double number, please");
        return getDouble();
    }

    public int getInt(){

        if (sc.hasNextInt()){
            int typeOfOperation = sc.nextInt();
            sc.nextLine();
            return typeOfOperation;
        }
        System.out.println("Wrong operation, choose  again");
        return getInt();
    }
}
