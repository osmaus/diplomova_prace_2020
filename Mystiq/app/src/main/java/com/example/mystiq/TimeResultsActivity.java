package com.example.mystiq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.charts.Cartesian;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;
import com.anychart.core.cartesian.series.Column;
import com.anychart.enums.Anchor;
import com.anychart.enums.HoverMode;
import com.anychart.enums.Position;
import com.anychart.enums.TooltipPositionMode;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;


import java.util.ArrayList;
import java.util.List;



public class TimeResultsActivity extends AppCompatActivity {

   BarChart barChart;
   ArrayList<BarEntry> barEntryArrayList;
   ArrayList<String>    labelNames;

   ArrayList<MonthSalesDara> MonthSalesDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeresults);

        barChart= findViewById(R.id.barChart);
        /*barEntryArrayList.clear();
        labelNames.clear();*/
        barEntryArrayList = new ArrayList<>();
        labelNames = new ArrayList<>();
        fillMonthSales();

        for (int i = 0;i < MonthSalesDataArrayList.size();i++){
            String month = MonthSalesDataArrayList.get(i).getMonth();
            int sales = MonthSalesDataArrayList.get(i).getSales();
            barEntryArrayList.add(new BarEntry(i, sales));
            labelNames.add(month);
        }

        BarDataSet barDataSet = new BarDataSet(barEntryArrayList, "Kvartální výsledky");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setValueTextSize(12);
        Description description = new Description();
        description.setText("Kvartál");
        barChart.setDescription(description);
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labelNames));
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setGranularity(1f);
        xAxis.setLabelCount(labelNames.size());
        xAxis.setLabelRotationAngle(270);
        xAxis.setTextSize(12);
        barChart.animateY(2000);
        barChart.invalidate();
        





    }

    private void fillMonthSales(){
        MonthSalesDataArrayList.clear();
        MonthSalesDataArrayList.add(new MonthSalesDara("Q1 2019", 70));
        MonthSalesDataArrayList.add(new MonthSalesDara("Q2 2019", 60));
        MonthSalesDataArrayList.add(new MonthSalesDara("Q3 2019", 80));
        MonthSalesDataArrayList.add(new MonthSalesDara("Q4 2019", 76));
        MonthSalesDataArrayList.add(new MonthSalesDara("Q1 2020", 90));

    }

}
