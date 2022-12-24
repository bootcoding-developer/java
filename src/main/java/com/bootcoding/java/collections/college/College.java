package com.bootcoding.java.collections.college;

import java.util.ArrayList;

public class College {

    private int id;
    private ArrayList<Department> depts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Department> getDepts() {
        return depts;
    }

    public void setDepts(ArrayList<Department> depts) {
        this.depts = depts;
    }
}
