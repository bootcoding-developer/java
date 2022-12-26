package com.bootcoding.java.nestedobjects;

import java.util.ArrayList;

public class User {
    private String name;
    private String userId;
    private UserRole role;
    private ArrayList<String> servers;
    private ArrayList<Integer> serverPort;
    private ArrayList<UserMachine> machines;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public ArrayList<String> getServers() {
        return servers;
    }

    public void setServers(ArrayList<String> servers) {
        this.servers = servers;
    }

    public ArrayList<Integer> getServerPort() {
        return serverPort;
    }

    public void setServerPort(ArrayList<Integer> serverPort) {
        this.serverPort = serverPort;
    }

    public ArrayList<UserMachine> getMachines() {
        return machines;
    }

    public void setMachines(ArrayList<UserMachine> machines) {
        this.machines = machines;
    }
}
