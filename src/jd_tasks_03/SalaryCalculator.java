package jd_tasks_03;
//Create a class named SalaryCalculator. Given the following variables:
//				hourlyRate (double)
//				weeklyHours (int)
//				stateTaxRate (double)
//				federalTaxRate (double)
//
//	Use the given information above to calculate the following:
//				salaryBeforeTax (Yearly salary before tax)
//				stateTax (Yearly state tax)
//				federalTax (Yearly federal tax)
//				totalTax (yearly total tax)
//				salaryAfterTax (Yearly salary after tax)
//
//		Assume that there are 52 work weeks in a year.
//
//	Display each of the above in the following format:
//
//					Example:
//						hourlyRate = $50
//						weeklyHours = 45
//						stateTaxRate = 6  (given as a percentage)
//						federalTaxRate = 26 (given as a percentage)
//
//					Output:
//						Gross pay is: $117000.0
//						Federal tax is: $30420.0
//						State tax is: $7020.0
//						Total tax is: $37440.0
//						Net income is: $79560.0

public class SalaryCalculator {
    public static void main(String[] args) {


                double hourlyRate=50.0;
                int weeklyHours=45;
                double stateTaxRate=0.06;
                double federalTaxRate=0.26;

                //Each year have 52 weeks.

                double grossPay= 52*hourlyRate*weeklyHours;
                double federalTax= federalTaxRate*grossPay;
                double stateTax= stateTaxRate*grossPay;
                double totalTax= federalTax+stateTax;
                double salaryAfterTax= grossPay-totalTax;


                System.out.println("Gross pay is:$" + grossPay);
                System.out.println("Federal tax is: $" + federalTax);
                System.out.println("State tax is: $" + stateTax);
                System.out.println("Total tax is : $" + totalTax);
                System.out.println("Net income is : $" + salaryAfterTax);


    }
}
