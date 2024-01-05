package main.java.lesson3.homework3.Exceptions;

public class MyDivideByZeroException extends ArithmeticException {

    public MyDivideByZeroException() {
        super("Деление на ноль");
    }

}