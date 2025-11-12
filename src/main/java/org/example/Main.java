package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        library.loadBookData();
        library.printBookData();

        library.loadEmployeeData();
        library.printEmployeeData();

    }
}