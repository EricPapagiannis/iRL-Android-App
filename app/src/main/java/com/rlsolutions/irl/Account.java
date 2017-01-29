package com.rlsolutions.irl;

public class Account {
    protected String userName;
    protected String password;
    protected String fName;
    protected String lName;

    public Account(String userName, String password, String fName, String lName){
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
