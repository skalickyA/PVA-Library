package org.example;

import org.example.Books.BookManager;
import org.example.Entita.Employee.EmployeeManager;

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
