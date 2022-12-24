package com.bootcoding.java.collections.college;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.concurrent.ExecutorCompletionService;

public class CollegeApp {
    public static void main(String[] args) {

        ArrayList<Department> departments = createDepartments();
        College kdkCollege = new College();
        kdkCollege.setId(1);
        kdkCollege.setDepts(departments);


        try {
            ObjectMapper om = new ObjectMapper();
            System.out.println(om.writeValueAsString(kdkCollege));
        }catch (Exception ex){

        }
    }

    private static ArrayList<Department> createDepartments() {
        String[] names = {"Electronics", "CSE", "IT", "Civil", "Electrical", "Mechanical", "ETC", "AIDS", "Metal", "Chemical"};
        Department d = new Department();
        d.setId(1);
        d.setName("Electronics");

        Department d2 = new Department();
        d2.setId(2);
        d2.setName("Computer");

        ArrayList<Department> departments = new ArrayList<>();
        for(int i = 1; i<= 10; i++){
            Department department = new Department();
            department.setId(i);
            department.setName(names[i-1]);
            departments.add(department);
            // Electronics; CSE, IT, Civil, Electrical, Mechanical, ETC, AIDS, Metal, Chemical
        }

        return departments;
    }
}
