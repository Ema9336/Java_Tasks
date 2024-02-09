package jd_tasks_06;
//
/*
5. Create a class named MathUtility:

        5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

If the operator is +:
The method should return the addition of the two numbers

If the operator is -:
The method should return the subtraction of the two numbers

If the operator is *:
The method should return the multiplication of the two numbers

If the operator is /:
The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


Example:
int result = calculate(10, '+', 20);

Output:
        30


        5.2 Overload the calculate method to handle double numbers.

Example:
double result = calculate(2.5, '*', 3.0);

Output:
        7.5


        5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
calculate method to calculate the square.

Example:
int num = square(8);

Output:
        64

        5.4 Overload the square method for double numbers.

Example:
double num = square(1.5);

Output:
        2.25

        5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
square method to calculate the cube.

Example:
int num = cube(3);

Output:
        9

        5.6 Overload the cube method for double numbers.

Example:
double num = cube(2.5);

Output:
        15.625
*/

public class MathUtility {
    public static void main(String[] args) {
        int result = calculate(10,20,'+');
        double reslt = operator(2.5,3.0,'*');
        System.out.println(result );
        System.out.println(reslt);
        System.out.println(square(8));
        System.out.println(square(1.5));
        System.out.println(cube(3));
        System.out.println(cube(2.5));
    }
    public static int calculate(int a, int b, char operator){
        boolean currentOperator= operator=='+'||operator=='-'|| operator=='*'||operator=='/';
        if(!currentOperator){
            return 0;
        }
        int result= (operator == '+')? a+b : (operator=='-')? a-b :(operator=='*')? a*b : (operator =='/')? a/b:0;
        return result;

    }
    public static double operator(double a, double b, char operator){
        boolean currentOperator= operator=='+'||operator=='-'|| operator=='*'||operator=='/';
        if(!currentOperator){
            return 0;
        }
        double result= (operator == '+')? a+b : (operator=='-')? a-b :(operator=='*')? a*b : (operator =='/')? a/b:0;
        return result;

    }
    public static int square( int a ){
        return a*a;
    }
    public static double square (double a ){
        return a*a;
    }
    public static int cube (int a ){
        return square(a);
    }
    public static double cube(double a){
        return a*a*a;
    }
}
