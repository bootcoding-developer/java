package com.bootcoding.java.file.calculator;

import java.io.File;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        String inputFile = fileService.createInputFile();
        List<Number> numbers = fileService.readFile(new File(inputFile));
        CalculatorService cs = new CalculatorService();
        cs.process(numbers);
        fileService.writeToFile(numbers);
    }
}
