package com.alevel;

public class Main {

    public static void main(String[] args) {
        OrderMaker maker = getMakerByName("Drink");

        Order order = maker.CreateOrder();
        order.getOrder();

    }

    public static OrderMaker getMakerByName(String maker){
        if(maker.equals("Dish"))
            return new Chef();
        else
            return new Bartender();
    }
}

interface Order{
    void getOrder();
}

class Dish implements Order{
    public void getOrder(){
        System.out.println("Cook a dish");
    }
}

class Drink implements Order {
    public void getOrder(){
        System.out.println("Make a cocktail");
    }
}

interface OrderMaker {
    Order CreateOrder();
}

class Chef implements OrderMaker{
    public Order CreateOrder(){
        return new Dish();
    }
}


class Bartender implements OrderMaker{
    public Order CreateOrder(){
        return new Drink();
    }
}