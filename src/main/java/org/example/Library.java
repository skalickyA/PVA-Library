package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Entita> entitaArrayList;

    public Library() {
        this.entitaArrayList = new ArrayList<>();
    }

    public void loadData(){
        String csvSoubor = "C:\\Users\\SkalickýAleš_4wrtv7e\\Downloads\\untitled10\\src\\main\\java\\org\\example\\test.csv";
        String radek;

        try (BufferedReader br = new BufferedReader(new FileReader(csvSoubor))) {
            br.readLine();
            while ((radek = br.readLine()) != null) {
                String[] hodnoty = radek.split(",");
                String jmeno = hodnoty[0];
                String prijmeni = hodnoty[1];
                int vek = Integer.parseInt(hodnoty[2]);

                entitaArrayList.add(new Entita(jmeno, prijmeni, vek));
            }
        } catch (IOException e) {
            System.out.println("Chyba při čtení souboru: " + e.getMessage());
        }
    }

    public void printData(){
        for (Entita x: entitaArrayList){
            System.out.println(x);
        }
    }
}
