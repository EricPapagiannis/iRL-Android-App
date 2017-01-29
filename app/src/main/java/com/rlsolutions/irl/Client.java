package com.rlsolutions.irl;

import java.util.ArrayList;

public class Client extends Account{
    private String number;
    private ArrayList<Drug> drugs;

    public Client(String userName, String password, String number, String fName, String lName){
        super(userName, password, fName, lName);
        this.number = number;
    }

    public void setDrug(Drug d){
        drugs.add(d);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
