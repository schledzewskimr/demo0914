package com.example.demo0914;
import java.util.ArrayList;

public class FastFoodKitchen {
    private ArrayList<BurgerOrder> orderList = new ArrayList<>();
    private static int nextOrderNum = 1;

    public int getNextOrderNum(){
        return nextOrderNum;
    }

    public void incrementNextOrderNum(){
        nextOrderNum++;
    }

    public FastFoodKitchen(){
        orderList.add(new BurgerOrder(3,5,4,10,false,getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new BurgerOrder(0,0,3,3,true,getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new BurgerOrder(1,1,0,2,false,getNextOrderNum()));
        incrementNextOrderNum();
    }

    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        orderList.add(new BurgerOrder(ham,cheese,veggie,soda,toGo,getNextOrderNum()));
        incrementNextOrderNum();
        return getNextOrderNum()-1;
    }

    public boolean cancelLastOrder(){
        if(orderList.isEmpty()){
            return false;
        }
        else {
            orderList.remove(orderList.size()-1);
            nextOrderNum--;
            return true;
        }
    }

    public int getNumOrdersPending(){
        return orderList.size();
    }

    public boolean isOrderDone(int orderID){
        for(BurgerOrder i:orderList){
            if(orderID == i.getOrderNum()){
               return false;
            }
        }
        return true;
    }

    public boolean cancelOrder(int orderID){
        for (BurgerOrder i:orderList){
            if(orderID == i.getOrderNum()){
                orderList.remove(orderID);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "FastFoodKitchen {" + "orderList=" + orderList + "}";
    }
}
