package snackBar;

public class Snack
{
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId = 0;

    public Snack(int id, String name, int quantity, double cost, int vendingMachineId)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
        
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public void addQuantity(int newQuantity)
    {
        this.quantity += newQuantity;
    }

    public void buySnack(int buyQuantity)
    {
        this.quantity -= buyQuantity;
    }

    public double getTotalCost(int totalQuantity)
    {
        return this.cost * totalQuantity;
    }
}