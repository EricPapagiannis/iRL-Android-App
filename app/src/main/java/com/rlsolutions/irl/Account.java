package com.rlsolutions.irl;

public class Account {
    private String userName;
    private String password;
    private String fName;
    private String lName;

    public Account(String userName, String password, String fName, String lName){
        this.userName = userName;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return this.fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return this.lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
