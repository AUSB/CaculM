package com.example.yajunbai.mcalc;

public class MortgageModel {
    private double principle;
    private int amortization;
    private double interest;
    public MortgageModel(String p, String a, String i) {
        this.principle = Double.parseDouble(p);
        this.amortization = Integer.parseInt(a);
        this.interest = Double.parseDouble(i);
    }
    public String computePayment() {
        double r = (this.interest / 100)/12;
        int n = this.amortization * 12;
        double payment = (this.principle * r)/ (1 -  1/ Math.pow((1 + r),n));
        String result = String.format("$%,.2f", payment);
        return result;
    }
    public static void main(String[] args)
    {
        MortgageModel myModel = new MortgageModel("700000","25","2.75");
        System.out.println(myModel.computePayment());

        myModel = new MortgageModel("300000","20","4.5");
        System.out.println(myModel.computePayment());
    }
    public String outstandingAfter()
    {
        int x = 5;
        double r = (this.interest / 100)/12;
        int n = this.amortization * 12;
        double xX = x * 12;
        double payment = (this.principle * r)/ (1 -  1/ Math.pow((1 + r),n));
        double outstandingbalance = this.principle-(payment / r - this.principle) * (Math.pow((1 + r ),xX) - 1);
//      System.out.println(outstandingbalance);
        String ret = String.format("$%,d", (int)(outstandingbalance));
        return ret;
    }
}
