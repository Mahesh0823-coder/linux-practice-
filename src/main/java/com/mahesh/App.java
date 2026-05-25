package com.mahesh;

import java.io.File;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try {

            File file = new File("mahesh.txt");

            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {

                String data = sc.nextLine();

                System.out.println(data);

            }

            sc.close();

        }

        catch(Exception e) {

            System.out.println("Error");

        }

    }

}
