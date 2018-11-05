package com.example.superman.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);

        }


    public void buttonClicked(View v) {
        EditText principleView = findViewById(R.id.principlebox);
        String principle = principleView.getText().toString();

        EditText amortizationView = findViewById(R.id.amortizationbox);
        String amortization = amortizationView.getText().toString();

        EditText interestView = findViewById(R.id.interestbox);
        String interest = interestView.getText().toString();


        MortgageModel myModel = new MortgageModel(principle, amortization, interest);
        String myPayment = myModel.computePayment();
        ((TextView) findViewById(R.id.paymentbox)).setText(myPayment);
    }

    public void button_Clicked(View v) {
        EditText principleView = findViewById(R.id.principlebox);
        String principle = principleView.getText().toString();

        EditText amortizationView = findViewById(R.id.amortizationbox);
        String amortization = amortizationView.getText().toString();

        EditText interestView = findViewById(R.id.interestbox);
        String interest = interestView.getText().toString();

        MortgageModel myModel = new MortgageModel(principle, amortization, interest);
        String balancePayment = myModel.outstandingAfter();
        ((TextView) findViewById(R.id.outstandingbox)).setText(balancePayment);
    }
}
