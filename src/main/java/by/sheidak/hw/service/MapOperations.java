package by.sheidak.hw.service;

import by.sheidak.hw.operations.*;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static final Map<Integer, MathOperation> MAP_OPERATION = new HashMap();

    static{
        MAP_OPERATION.put(1, new Addition());
        MAP_OPERATION.put(2, new Subtraction());
        MAP_OPERATION.put(3, new Multiplication());
        MAP_OPERATION.put(4, new Division());
    }
}
