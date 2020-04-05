package com.example.mystiq;

public class AnswerData {
    String answer;
    int count;

    public AnswerData(String answer, int count){
        this.answer = answer;
        this.count = count;
    }

    public String getAnswer() {
        return answer;
    }

    public int getCount() {
        return count;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCount(int count) {
        this.count = count;
    }
}