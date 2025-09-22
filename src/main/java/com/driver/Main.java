package com.driver;

public class Main {
    public static void main(String[] args){
        Product p = new Product();
        p.product(2,8);
        p.product(5,6,7);
        p.product(4.50,2.50);
    }

class Product{
    public int product(int x, int y) {}
    public int product(int x, int y, int z) {}
    public double product(double x, double y) {}


}

}