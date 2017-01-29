package com.rlsolutions.irl;

import java.util.ArrayList;

public class HealthProvider extends Account{
    private String number;
    private ArrayList<Client> clients;

    public HealthProvider(String userName, String password, String number, String fName, String lName){
        super(userName, password, fName, lName);
        this.number = number;
        clients = new ArrayList<Client>();
    }

    public void addClient(Client c){
        clients.add(c);
    }

    public void removeClient(Client c){
        clients.remove(c);
    }
    
    public ArrayList<Client> getClients() {
        return clients;
    }

    public String getNumber() {
        return number;
    }
}
