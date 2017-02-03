package com.rlsolutions.irl;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HealthProvider extends Account{
    //private String fName;
    private String lName;
    private ArrayList<Client> clients;
    private Map<String,String> foodMap = new HashMap<String,String>();

    public HealthProvider(String userName, String password, String fName, String lName){
        super(userName, password, fName, lName);
        clients = new ArrayList<Client>();
    }

    public void addClient(String userName, String password, String fName, String lName){
        Client c = new Client(userName, password, fName, lName, this);
        clients.add(c);
        foodMap.put(userName,c.fName);
    }

    public void writeTo(String userName, String message){
        this.setfName(foodMap.get(userName));

        PrintWriter writer = null;
        try{
            FileWriter fw = new FileWriter(this.getfName(),true);
            writer = new PrintWriter(fw);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        writer.println(this.getfName() + ": " + message);
        writer.close();
    }

    public void removeClient(Client c){

        clients.remove(c);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

}
