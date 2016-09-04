package com.alandwiprasetyo;

public class Main {
    String name;
    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.name = "Hello";

        Main test = main;
        test.name = "ELA ELO";
        System.out.println(main.name);
        System.out.println(test.name);
    }
}
