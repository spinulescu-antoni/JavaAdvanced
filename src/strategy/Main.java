package strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cosCumparaturi = new ShoppingCart();
        Item item1 = new Item("1001", 320);
        Item item2 = new Item("1002", 460);

        cosCumparaturi.addItem(item1);
        cosCumparaturi.addItem(item2);

        System.out.println(cosCumparaturi.calculateTotal());
        cosCumparaturi.pay(new CreditCardStrategy("Andrei","4256031142778852", "887","11/28"));
        cosCumparaturi.pay(new PaypalStrategy("andrei06@gmail.com","5432"));

    }
}
