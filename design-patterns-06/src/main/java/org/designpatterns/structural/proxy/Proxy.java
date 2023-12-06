package org.designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class Proxy {
    public static void main(String[] args) {
        CachedInformation information = new CachedInformation(new DatabaseInformation());
        System.out.println(information.getRows());
        System.out.println(information.getRows());
    }
}

interface Information {
    List<Integer> getRows();
}

class DatabaseInformation implements Information {

    @Override
    public List<Integer> getRows() {
        System.out.println("system retrieve from database");
        return Arrays.asList(3,8,9);
    }
}

class CachedInformation implements Information { // proxy
    private Information information;
    private List<Integer> rows;

    public CachedInformation(Information information) {
        this.information = information;
    }

    @Override
    public List<Integer> getRows() {
        if (this.rows != null) {
            System.out.println("retrieve from cache");
            return this.rows;
        }
        List<Integer> informationRows = this.information.getRows();
        this.rows = informationRows;
        return informationRows;
    }
}