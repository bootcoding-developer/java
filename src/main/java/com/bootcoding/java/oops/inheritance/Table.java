package com.bootcoding.java.oops.inheritance;

public class Table {
    int legs;
    boolean tableTop;
    String tableType;
    Material material;

    private void move(){
        System.out.println("Moving Table to another location");
    }
    public void createTable(){
        System.out.println("Create New Table");
    }
}
