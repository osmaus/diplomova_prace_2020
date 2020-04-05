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

public class AnswerResultsActivity extends AppCompatActivity {

    PieChart pieChart;
    ArrayList<PieEntry> pieEntries;
    ArrayList<AnswerData> answerDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_results);

        pieChart = findViewById(R.id.piechart);
        pieEntries = new ArrayList<>();

        fillAnswersList();
        for (int i = 0; i < answerDataArrayList.size();i++){
            String answer = answerDataArrayList.get(i).getAnswer();
            int count = answerDataArrayList.get(i).getCount();
            pieEntries.add(new PieEntry(count, answer));

        }

        PieDataSet pieDataSet = new PieDataSet(pieEntries, "Odpovědi");
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

    private void fillAnswersList(){
        answerDataArrayList.add(new AnswerData("Ano", 60));
        answerDataArrayList.add(new AnswerData("Ne", 40));

    }
}
