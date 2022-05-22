package com.example.sorting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Scanner;

public class MainActivity3 extends AppCompatActivity {

    EditText enteredNumbers;
    TextView sortedNumbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        enteredNumbers = findViewById(R.id.enteredNumbers);
        sortedNumbers = findViewById(R.id.sortedNumbers);
    }
    public void sort(View view){
        String[] numberList = enteredNumbers.getText().toString().split(",");
        Integer[] numbers = new Integer[numberList.length];

        for(int i=0; i < numberList.length; i++){
            numbers[i]=Integer.parseInt(numberList[i]);
        }
        bubbleSort(numbers, numbers.length); // Sorted numbers
        sortedNumbers.setText(Arrays.toString(numbers));
    }

    private void bubbleSort(Integer[] numbers, int length){
        if(length < 2){
            return;
        }
        for (int i = 0; i < length-1; i++){
            if(numbers[i] > numbers[i+1]){
                Integer temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        bubbleSort(numbers, length-1);

    }
}

