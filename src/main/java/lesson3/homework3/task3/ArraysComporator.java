package main.java.lesson3.homework3.task3;

import main.java.lesson3.homework3.Exceptions.MyArraysSizeException;
import main.java.lesson3.homework3.Exceptions.MyArraysTypeException;

import java.util.Arrays;

public class ArraysComporator {
    public <E, T> boolean compareArrays(E[] array1, T[] array2) throws MyArraysSizeException, MyArraysTypeException {
        if (array1.length != array2.length) throw new MyArraysSizeException();
        if (array1.getClass() != array2.getClass()) throw new MyArraysTypeException();
        return Arrays.equals(array1, array2);
    }
}