package com.sgtesting.interfacedemo;
interface Product
{
    static void showProductName(String name)
    {
        System.out.println("Product Name :"+name);
    }

    void showPrice(double price);
}

class Dell implements Product
{
    public void showPrice(double price)
    {
        System.out.println("Price of the Product:"+price);
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Dell o=new Dell();
        Product.showProductName("Dell Laptop");
        o.showPrice(12400.00);
    }
}
