package com.uas.prakrplbo;

public class Cyclops extends Monster{
    public Cyclops(String nama){
        super(nama);
    }
    public String bersuara(){
        return ("Hohohoho");
    }

    public String bergerak(){
        return ("Berjalan");
    }
}