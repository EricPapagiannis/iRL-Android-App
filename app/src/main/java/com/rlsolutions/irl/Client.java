package com.rlsolutions.irl;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class Client extends Account{
    private HealthProvider hProv;
    public String fName = "coversation_";

    public Client(String userName, String password, String fName, String lName, HealthProvider h){
        super(userName, password, fName, lName);
        this.hProv = h;

        this.fName += userName + ".txt";

        PrintWriter writer = null;
        try{
            writer = new PrintWriter(fName);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        writer.close();
    }

    public void writeTo(String message){
        PrintWriter writer = null;
        try{
            FileWriter fw = new FileWriter(fName,true);
            writer = new PrintWriter(fw);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        writer.println(fName + ": " + message);
        writer.close();
    }

    public HealthProvider getProvider(){
        return this.hProv;
    }
}