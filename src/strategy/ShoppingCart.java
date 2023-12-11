package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public int calculateTotal(){
        int totalPlata = 0;
        int i = 0;
        while (i < items.size()){
            totalPlata = totalPlata + items.get(i).getPrice();
            i++;
        }


//        for (Item item : items){
//            totalPlata = totalPlata + item.getPrice();
//        }



//        for(int i = 0;i < items.size(); i++){
//            totalPlata = totalPlata + items.get(i).getPrice();
//        }
        return totalPlata;
    }
    public void pay(PaymentStrategy paymentStrategy){
       int suma = calculateTotal();
       paymentStrategy.pay(suma);
    }
}
