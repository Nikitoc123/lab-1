//package bsu.rfe.java.lab1;

public class Milk extends Food
{
    private String fat;
    public Milk(String fat)
    {
        super("Молоко");
        this.fat = fat;
    }

    public boolean equals(Object arg0)
    {
        if (super.equals(arg0))
        { // Шаг 1
            if (!(arg0 instanceof Milk)) return false; // Шаг 2
            return fat.equals(((Milk) arg0).fat); // Шаг 3
        } else
            return false;
    }

    public String  getFat()
    {
        return fat;
    }
    public void consume()
    {
        System.out.println(this + " выпито");
    }

    public String toString()
    {
        return super.toString() + " жирности " + fat.toUpperCase();
    }
}