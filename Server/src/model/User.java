package model;


public class User {

    private final String name, pass;
    private Boolean online;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
        this.online = false;//no momento do cadastro ele está deslogado
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
