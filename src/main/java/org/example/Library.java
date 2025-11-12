package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {

    private BookManager bookManager;
    private EmployeeManager employeeManager;

    public Library() {
        this.bookManager = new BookManager();
        this.employeeManager = new EmployeeManager();
    }


    public void loadBookData(){
        bookManager.loadBookData();
    }

    public void printBookData(){
        bookManager.printBookData();
    }

    public void loadEmployeeData(){
        employeeManager.loadEmployeeData();
    }

    public void printEmployeeData(){
        employeeManager.printEmployeeData();
    }







}
