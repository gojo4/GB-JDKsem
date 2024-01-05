package main.java.lesson3.homework3.Exceptions;

public class MyArraysTypeException extends RuntimeException {

    public MyArraysTypeException() {
        super("Отличие типов массивов");
    }
}