package snackBar;

public class Customer
{
    private int id;
    private String name;
    private double cash;

    public Customer(int id, String name, double cash)
    {
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

    public void addCash(double newCash)
    {
        this.cash += newCash;
    }

    public void useCash(double byeCash)
    {
        this.cash -= byeCash;
    }

    public double getCash()
    {
        return cash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}