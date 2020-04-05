package com.example.mystiq;

public class MonthSalesDara {
    String month;
    int sales;

    public MonthSalesDara (String month, int sales){
        this.month = month;
        this.sales = sales;
    }

    public String getMonth(){
        return month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public int getSales(){
        return sales;
    }

    public void setSales(int sales){
        this.sales = sales;
    }
}


