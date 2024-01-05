package main.java.lesson2.seminar2;

public class BackEnder extends Developer implements BackendAction{
    @Override
    public void back() {
        System.out.println("BackEnd working");
    }

    @Override
    public void developGUI() {
        System.out.println("BackEnder GUI method");
    }
}