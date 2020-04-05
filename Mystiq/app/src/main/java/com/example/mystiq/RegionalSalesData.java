package com.example.mystiq;

public class RegionalSalesData {




    String region;
    int sales;

    public RegionalSalesData(String region, int sales) {
        this.region = region;
        this.sales = sales;
    }

    public String getRegion() {
        return region;
    }

    public int getSales() {
        return sales;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }




}
