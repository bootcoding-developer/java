package com.bootcoding.java.file.calculator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FileService {


    public List<Number> readFile(File file){
        try {
            Scanner sc = new Scanner(file);
            List<Number> numbers = new ArrayList<>();
            while(sc.hasNext()){
                String line = sc.nextLine();
                numbers.add(convertToNumber(line));
            }
            return numbers;
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return Collections.emptyList();
    }

    private Number convertToNumber(String line) {
        String[] tokens = line.trim().split(",");
        Number number = new Number();
        number.setNumbers(Arrays.stream(tokens)
                .map(Integer::valueOf)
                .collect(Collectors.toList()));
        return number;
    }

    public String createInputFile(){
        String path = "/Users/bootcoding/workspace/java/src/main/java/com/bootcoding/java/file/calculator/input.txt";

        try {
            File file = new File(path);
            file.createNewFile();
            int noOfLines = 100;
            List<String> lines = new ArrayList<>();
            while(noOfLines > 0 ){
                String line = "" + NumberGenerator.getNumber();
                for(int i=1; i <= NumberGenerator.getInputParameterCount(); i++){
                    line = line + "," + NumberGenerator.getNumber();
                }
                lines.add(line + "\n");
                noOfLines--;
            }

            FileWriter fw = new FileWriter(file);
            for(String line: lines){
                fw.write(line);
            }

            fw.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return path;
    }

    public void writeToFile(List<Number> numbers) {
       try{
           FileWriter fw = new FileWriter("/Users/bootcoding/workspace/java/src/main/java/com/bootcoding/java/file/calculator/output.txt");
           for(Number number: numbers){
               fw.write(toString(number));
           }

           fw.close();
       }catch (IOException ex){
           ex.printStackTrace();
       }
    }

    private String toString(Number number) {
        List<Integer> numbers = number.getNumbers();
        String output = "," + number.getAddition() + "," + number.getSubtraction() + "," + number.getMultiplication();
        return numbers.stream().map(String::valueOf)
                .collect(Collectors.joining(",")) + output + "\n";
    }
}
