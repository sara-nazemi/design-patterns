package org.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public interface Department {
}

class FinancialDepartment implements Department {
    private String name;
}

class HumanResourceDepartment implements Department {
    private String name;
}

class MainDepartment implements Department {
    private String name;
    private List<Department> children; // composition

    public void setChildren(List<Department> children) {
        this.children = children;
    }
}

class Run {
    public static void main(String[] args) {
        Department finance = new FinancialDepartment();
        Department hr = new HumanResourceDepartment();
        MainDepartment sarv = new MainDepartment();
        List<Department> sarvDepartments = new ArrayList<>();
        sarvDepartments.add(finance);
        sarvDepartments.add(hr);
        sarv.setChildren(sarvDepartments);

        Department financeBurs = new FinancialDepartment();
        Department hrBurs = new HumanResourceDepartment();
        MainDepartment burs = new MainDepartment();
        List<Department> bursDepartments = new ArrayList<>();
        bursDepartments.add(financeBurs);
        bursDepartments.add(hrBurs);
        burs.setChildren(bursDepartments);

        sarvDepartments.add(burs);
    }
}
