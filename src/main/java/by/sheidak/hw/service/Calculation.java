package by.sheidak.hw.service;

import by.sheidak.hw.operations.MathOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

@Component
public class Calculation {

    //private MathOperation mathOperation;

    static double result = 0;
//
//    @Autowired
//    public Calculation(MathOperation mathOperation) {
//        this.mathOperation = mathOperation;
//    }
//
//    public Calculation() {}
//
//    public MathOperation getMathOperation() {
//        return mathOperation;
//    }
//
//    public void setMathOperation(MathOperation mathOperation) {
//        this.mathOperation = mathOperation;
//    }

    public double getResult(double num1, double num2, int typeOfOperation){
        if (MapOperations.MAP_OPERATION.containsKey(typeOfOperation)){
            MathOperation mathOp = MapOperations.MAP_OPERATION.get(typeOfOperation);
            result = mathOp.getCalc(num1, num2);
        }
        return result;
    }
}
