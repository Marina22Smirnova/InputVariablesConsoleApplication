package com.marina;

import java.util.Scanner;

public class Main {

            public static void main(String[] args){
                Scanner input=new Scanner(System.in);
                int now=2022;
                String name;
                int age;
                double height;
                double mass;
                System.out.println("Ваше имя:");
                name=input.nextLine();
                System.out.println("Ваш возраст:");
                age=input.nextInt();
                System.out.println("Ваш рост (в метрах):");
                height=input.nextDouble();
                System.out.println("Масса тела (в киллограммах):");
                mass=input.nextDouble();
                double bmi=mass/height/height;
                System.out.println("Здравствуйте, "+name+"!");
                System.out.printf("Ваш индекс массы тела: %5.2f\n",bmi);
            }
    }

