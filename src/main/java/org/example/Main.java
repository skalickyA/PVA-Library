package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        library.loadData();
        library.printData();
        System.out.println();
        System.out.println();
        library.ageFilter();

        System.out.println("test");
        System.out.println("test");
        System.out.println("test3");
    }
}