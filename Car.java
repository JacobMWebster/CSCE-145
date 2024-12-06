package Lab10;
//Jacob Webster
public class Car extends Vehicle {
    
    //Instance Variables
    private double mileage;
    private int passengers;

    //Default Constructor
    public Car()
    {
        this.mileage = 0;
        this.passengers = 0;
    }

    //Parameterized Constructor
    public Car(String xmanuName, int xcylinders, String xownersName, double xmileage, int xpassengers)
    {
        this.setManuName(xmanuName);
        this.setCylinders(xcylinders);
        this.setOwnersName(xownersName);
        this.setMileage(xmileage);
        this.setPassengers(xpassengers);
    }

    //Accessors
    public double getMileage()
    {
        return this.mileage;
    }

    public int getPassengers()
    {
        return this.passengers;
    }

    //Mutators
    public void setMileage(double xmileage)
    {
        if(xmileage > 0)
        {
            this.mileage = xmileage;
        }
    }

    public void setPassengers(int xpassengers)
    {
        if(xpassengers > 0)
        {
            this.passengers = xpassengers;
        }
    }

    //Methods
    public boolean equals()
    {
        return true;
    }

    public String toString()
    {
        return "Manufacturer: " + this.manuName + "\n# of Cylinders: " + this.cylinders+ "\nOwner: " + this.ownersName + "\nMileage: " + this.mileage + "\nPassengers " + this.passengers;
    }
}
