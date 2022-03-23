package ru.vsu.cs.course1;

import ru.vsu.cs.util.ArrayUtils;

public class Console {
    public static void main(String[] args){
        try {
            String inputFileName = args[0];
            String outputFileName = args[1];
            int[] input = ArrayUtils.readIntArrayFromFile(inputFileName);
            int[] output = Task.process(input);
            ArrayUtils.writeArrayToFile(outputFileName, output);
        } catch (Exception e){
            System.out.println("Error");
        }


    }
}
