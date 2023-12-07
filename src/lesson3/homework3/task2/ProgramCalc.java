package lesson3.homework3.task2;

public class ProgramCalc {

    public void programCalc() {
        int num1 = 2;
        float num2 = 19;
        System.out.println(num1 + " + " + num2 + " = " + Calc.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + Calc.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calc.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calc.divide(num1, num2));
    }
}
