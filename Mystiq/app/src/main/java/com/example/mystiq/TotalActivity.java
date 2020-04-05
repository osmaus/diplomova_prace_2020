package com.example.mystiq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class TotalActivity extends AppCompatActivity {

    PieChart pieChart;
    ArrayList<PieEntry> pieEntries;
    ArrayList<RegionalSalesData> regionalSalesDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        pieChart = findViewById(R.id.piechart);
        pieEntries = new ArrayList<>();

        fillRegionalSalesList();
        for (int i = 0; i < regionalSalesDataArrayList.size();i++){
            String region = regionalSalesDataArrayList.get(i).getRegion();
            int sales = regionalSalesDataArrayList.get(i).getSales();
            pieEntries.add(new PieEntry(sales, region));

        }

        PieDataSet pieDataSet = new PieDataSet(pieEntries, "Regional sales");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextSize(16);
        PieData pieData = new PieData(pieDataSet);
        pieData.setValueFormatter(new PercentFormatter());
        pieChart.setData(pieData);
        Legend legend = pieChart.getLegend();
        legend.setTextSize(12);
        legend.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        legend.setWordWrapEnabled(true);
        pieChart.animateXY(2000,2000);
        pieChart.invalidate();



    }


    private void fillRegionalSalesList(){
        regionalSalesDataArrayList.add(new RegionalSalesData("Splněno", 70));
        regionalSalesDataArrayList.add(new RegionalSalesData("Nesplněno", 30));


    }
}
