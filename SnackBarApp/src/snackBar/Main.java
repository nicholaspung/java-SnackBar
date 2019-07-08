package snackBar;

public class Main
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer(1, "Jane", 45.24);
        Customer c2 = new Customer(2, "Bob", 33.14);

        VendingMachine food = new VendingMachine(1, "Food");
        VendingMachine drink = new VendingMachine(2, "Drink");
        VendingMachine office = new VendingMachine(3, "Office");

        Snack s1 = new Snack(1, "Chips", 36, 1.75, 1);
        Snack s2 = new Snack(2, "Chocolate Bar", 36, 1.00, 1);
        Snack s3 = new Snack(3, "Pretzel", 30, 2.00, 1);
        Snack s4 = new Snack(4, "Soda", 24, 2.50, 2);
        Snack s5 = new Snack(5, "Water", 20, 2.75, 2);

        System.out.println("*** Processing ***");

        System.out.println("1.");
        c1.useCash(s4.getTotalCost(3));
        s4.buySnack(3);
        System.out.println("c1 cash: " + c1.getCash());
        System.out.println("s4 quantity: " + s4.getQuantity());

        System.out.println("2.");
        c1.useCash(s3.getCost());
        s3.buySnack(1);
        System.out.println("c1 cash: " + c1.getCash());
        System.out.println("s3 quantity: " + s3.getQuantity());

        System.out.println("3.");
        c2.useCash(s4.getTotalCost(2));
        s4.buySnack(2);
        System.out.println("c2 cash: " + c2.getCash());
        System.out.println("4 quantity: " + s4.getQuantity());

        System.out.println("4.");
        c1.addCash(10.00);
        System.out.println("c1 cash: " + c1.getCash());

        System.out.println("5.");
        c1.useCash(s2.getCost());
        s2.buySnack(1);
        System.out.println("c1 cash: " + c1.getCash());
        System.out.println("s2 quantity: " + s2.getQuantity());

        System.out.println("6.");
        s3.addQuantity(12);
        System.out.println("s3 quantity: " + s3.getQuantity());

        System.out.println("7.");
        c2.useCash(s3.getTotalCost(3));
        s3.buySnack(3);
        System.out.println("c2 cash: " + c2.getCash());
        System.out.println("s3 quantity: " + s3.getQuantity());
    }
}