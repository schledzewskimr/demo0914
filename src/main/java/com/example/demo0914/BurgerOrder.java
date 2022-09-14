package com.example.demo0914;

public class BurgerOrder {
    //initialize to 0
    private int numHamburgers=0;
    private int numCheeseburgers=0;
    private int numVeggieburgers=0;
    private int numSodas=0;
    //initialize orderToGo to false
    private boolean orderToGo=false;
    //initialize orderNum to any positive int
    private int orderNum = 1;

    //constructor
    public BurgerOrder(int numHamburgersOrder, int numCheeseburgersOrder, int numVeggieburgersOrder, int numSodasOrder, boolean orderToGoOrder, int orderNumOrder){
        setNumHamburgers(numHamburgersOrder);
        setNumCheeseburgers(numCheeseburgersOrder);
        setNumVeggieburgers(numVeggieburgersOrder);
        setNumSodas(numSodasOrder);
        setOrderToGo(orderToGoOrder);
        setOrderNum(orderNumOrder);
    }

    //HAMBURGERS
    //getter for numHamburgers
    public int getNumHamburgers() {
        return numHamburgers;
    }
    //setter for numHamburgers checks if there is more than 0 burgers otherwise it errors
    public void setNumHamburgers(int numHamburgers) {
        if(numHamburgers>=0) {
            this.numHamburgers = numHamburgers;
        }
        else{
            System.out.println("not enough burgers");
        }
    }

    //CHEESEBURGERS
    public int getNumCheeseburgers() {
        return numCheeseburgers;
    }
    public void setNumCheeseburgers(int numCheeseburgers) {
        if(numCheeseburgers>=0) {
            this.numCheeseburgers = numCheeseburgers;
        }
        else{
            System.out.println("not enough cheeseburgers");
        }
    }
    //VEGGIEBURGERS
    public int getNumVeggieburgers() {
        return numVeggieburgers;
    }
    public void setNumVeggieburgers(int numVeggieburgers) {
        if(numVeggieburgers>=0) {
            this.numVeggieburgers = numVeggieburgers;
        }
        else{
            System.out.println("not enough veggieburgers");
        }
    }

    //SODAS
    public int getNumSodas() {
        return numSodas;
    }
    public void setNumSodas(int numSodas) {
        if(numSodas>=0) {
            this.numSodas = numSodas;
        }
        else{
            System.out.println("not enough sodas");
        }
    }

    //ORDERTOGO
    public boolean isOrderToGo() {
        return orderToGo;
    }
    public void setOrderToGo(boolean orderToGo){
        this.orderToGo = orderToGo;
    }

    //ORDERNUM
    public int getOrderNum(){
        return orderNum;
    }
    public void setOrderNum(int orderNum){
        this.orderNum = orderNum;
    }

    //toString
    public String toString(){
        return "Burger Order {" + "numHamburgers = " + numHamburgers + ", numCheeseburgers = " + numCheeseburgers + ", numVeggieBurgers = " + numVeggieburgers + ", numSodas = " + numSodas + ", orderToGo = " + orderToGo + ", orderNum =" + orderNum + "}";
    }
}
