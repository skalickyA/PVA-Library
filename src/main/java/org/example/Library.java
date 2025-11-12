package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {

    private BookManager bookManager;

    public Library() {
        this.bookManager = new BookManager();
    }


    public void loadBookData(){
        bookManager.loadBookData();
    }

    public void printBookData(){
        bookManager.printBookData();
    }





}
