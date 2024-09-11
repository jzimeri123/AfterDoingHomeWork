package org.example.e158;

public class E158MethodOverloading {
    public static void main(String[] args){
        //create object of LoanPaymentCalculator
LoanPaymentCalculator calculator=new LoanPaymentCalculator();
String lineSeparator=System.lineSeparator();

        // Call the first calculatePayment method with two arguments
        double result1 = calculator.calculatePayment(10000, 5);
        System.out.printf("%.2f" + lineSeparator, result1);

        // Call the second calculatePayment method with three arguments
        double result2 = calculator.calculatePayment(10000, 5, 24);
        System.out.printf("%.2f" + lineSeparator, result2);

        // Call the third calculatePayment method with four arguments
        double result3 = calculator.calculatePayment(10000, 5, 24, 2000);
        System.out.printf("%.2f" + lineSeparator, result3);


/*double d1=result.calculatePayment(10000.0,5.0);
double d2=result.calculatePayment(10000.0,5.0,24);
double d3=result.calculatePayment(10000.0,5.0,24,2000.0);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);*/
    }
}
class LoanPaymentCalculator{
    //method to calculate monthly payment for simple loan
    double calculatePayment(double loanAmount, double interestRate){
        double payment = (loanAmount * (1 + interestRate/100))/12;
        return payment;
    }

    //method to calculate monthly payment with custom term
    double calculatePayment(double loanAmount,double interestRate, double months){
        double payment= payment = (loanAmount * (1 + (interestRate / 100)) / months);
        return payment;
    }

    //method to calculate monthly payment for a loan with custom term and down payment
   double calculatePayment(double loanAmount,double interestRate, double months, double downPayment){
        double payment = (loanAmount - downPayment) * (1 + interestRate/100)/months;
        return payment;
   }

}
