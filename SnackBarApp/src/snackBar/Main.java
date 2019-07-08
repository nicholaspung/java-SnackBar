package snackBar;

public class Main
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer(1, "Jane", 45.24);
        Customer c2 = new Customer(2, "Bob", 33.14);

        VendingMachine vm1 = new VendingMachine(1, "Food");
        VendingMachine vm2 = new VendingMachine(2, "Drink");
        VendingMachine vm3 = new VendingMachine(3, "Office");

        Snack s1 = new Snack(1, "Chips", 36, 1.75, vm1.getId());
        Snack s2 = new Snack(2, "Chocolate Bar", 36, 1.00, vm1.getId());
        Snack s3 = new Snack(3, "Pretzel", 30, 2.00, vm1.getId());
        Snack s4 = new Snack(4, "Soda", 24, 2.50, vm2.getId());
        Snack s5 = new Snack(5, "Water", 20, 2.75, vm2.getId());

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

        System.out.println("Stretch");
        System.out.println("Name: " + s1.getName() + "\n" + "Vending Machine Name: " + vm1.getName() + "\n" + "Quantity on hand: " + s1.getQuantity() + "\n" + "Total cost of all quantities of this snack on hand: " + s1.getTotalCost(s1.getQuantity()));

        System.out.println("Name: " + s2.getName() + "\n" + "Vending Machine Name: " + vm1.getName() + "\n" + "Quantity on hand: " + s2.getQuantity() + "\n" + "Total cost of all quantities of this snack on hand: " + s2.getTotalCost(s2.getQuantity()));

        System.out.println("Name: " + s3.getName() + "\n" + "Vending Machine Name: " + vm1.getName() + "\n" + "Quantity on hand: " + s3.getQuantity() + "\n" + "Total cost of all quantities of this snack on hand: " + s3.getTotalCost(s3.getQuantity()));

        System.out.println("Name: " + s4.getName() + "\n" + "Vending Machine Name: " + vm2.getName() + "\n" + "Quantity on hand: " + s4.getQuantity() + "\n" + "Total cost of all quantities of this snack on hand: " + s4.getTotalCost(s4.getQuantity()));

        System.out.println("Name: " + s5.getName() + "\n" + "Vending Machine Name: " + vm2.getName() + "\n" + "Quantity on hand: " + s5.getQuantity() + "\n" + "Total cost of all quantities of this snack on hand: " + s5.getTotalCost(s5.getQuantity()));
    }
}