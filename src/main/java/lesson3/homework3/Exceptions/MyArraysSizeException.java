package main.java.lesson3.homework3.Exceptions;

public class MyArraysSizeException extends RuntimeException {

    public MyArraysSizeException() {
        super("Длины массивов не равны");
    }
}