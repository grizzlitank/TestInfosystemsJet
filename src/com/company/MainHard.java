package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainHard {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\ROWNUM RESULT.txt");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(args[0]), StandardCharsets.UTF_8))){
            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                counter++;
                String[] lines = line.split(" ");
                if(lines[0].equals("ACK")) {

                    writer.write(counter + " " + String.valueOf(MainHard.recursion(Integer.parseInt(lines[1]), Integer.parseInt(lines[2]))));
                    writer.append("\n");


                }

                if(lines[0].equals("F")) {

                    writer.write(counter + " " + String.valueOf(MainHard.factorial(Integer.parseInt(lines[1]))));
                    writer.append("\n");


                }

                if(lines[0].equals("FIB")) {
                    writer.write(counter + " " + String.valueOf(MainHard.fibonachi(Integer.parseInt(lines[1]))));
                    writer.append("\n");


                }



            }
        } catch (IOException e) {
            // log error
        }
        writer.close();

    }

    public static int recursion(int m, int n) {
        // Базовый случай
        if (m == 0) {
            return n + 1;
        } // Шаг рекурсии / рекурсивное условие
        else if (n == 0 && m > 0) {
            return recursion(m - 1, 1);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion(m - 1, recursion(m, n - 1));
        }
    }

    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        else{

            return x * factorial(x - 1);
        }
    }

    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

}
