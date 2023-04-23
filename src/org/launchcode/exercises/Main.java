package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static double Divide(int x, int y) {
        double grade = x/y;
        if (y == 0) {
            try {
                throw new ArithmeticException("Value is undefined. 'Y' cannot be 0");
            } catch (ArithmeticExeption e) {
                e.printStackTrace();
            }
        }
        return grade;
    }

    public static int CheckFileExtension(String fileName)
    {
      for (String student : studentFiles) {
          }
    }

}
