
//Example for Inheritence

public class Vehicle {
    int gear;
    String speed;

    public Vehicle(){}

    public Vehicle(int gear,String speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

}
// MountainCycle is the Sub Class of Vehicle

class MountainCycle extends Vehicle
{
    String color;

    public MountainCycle(String color)
    {
        this.color = color;
    }

    //Method to display both Vehicle and MountainCycle class attributes

    public void ride()
    {
        System.out.println("Number of Gear : \""+gear+"\"");
        System.out.println("Speed of Cycle : \""+speed+"\"");
        System.out.println("Color of Cycle : \""+color+"\"");
    }

    public static void main(String args[])
    {
        //Create object of the Sub Class(MountainCycle)
        MountainCycle mb = new MountainCycle("Blue");
        //Set the values to the Cycle class attributes through MountainCycle object
        mb.speed = "50kmph";
        mb.gear = 5;
        mb.ride();
    }
}