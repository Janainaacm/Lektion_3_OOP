package com.Janaina.OOP;

import com.Janaina.OOP.model.Student;

public class Main {

    public static void main(String[] args) {

        System.out.println("Is this the first COMMIT?!");

        //Instantiate Object
        Student benny = new Student("Benny", 16);
        Student frida = new Student("Frida", 18);

        System.out.println(addition (56, 789));


    }


    public static int addition(int x, int y){
        return (x + y);

    }


}
