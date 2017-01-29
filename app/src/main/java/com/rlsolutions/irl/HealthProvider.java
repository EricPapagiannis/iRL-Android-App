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

    public void addClient(String userName, String password, String number, String fName, String lName){
        Client c = new Client(userName, password, number, fName, lName, this);
        clients.add(c);

    }

    public void writeTo(String userName, String message){

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
