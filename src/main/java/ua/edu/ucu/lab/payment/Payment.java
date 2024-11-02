package ua.edu.ucu.lab.payment;

public interface Payment {
    void setPrice(double price);
    boolean getIsFullyPayed();
    void pay(double price);
}
