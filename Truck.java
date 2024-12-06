package Lab10;
//Jacob Webster
public class Truck extends Vehicle{
    
    //Instance Variables
    private double loadCap;
    private double towCap;

    //Default Constructor
    public Truck()
    {
        this.loadCap = 0;
        this.towCap = 0;
    }
    
    //Parameterized Constructor
    public Truck(String xmanuName, int xcylinders, String xownersName, double xloadCap, double xtowCap)
    {
        this.setManuName(xmanuName);
        this.setCylinders(xcylinders);
        this.setOwnersName(xownersName);
        this.setLoadCap(xloadCap);
        this.setTowCap(xtowCap);
    }

    //Accessors
    public double getLoadCap()
    {
        return this.loadCap;
    }

    public double getTowCap()
    {
        return this.towCap;
    }
    
    //Mutators
    public void setLoadCap(double xloadCap)
    {
        if(xloadCap > 0)
        {
            this.loadCap = xloadCap;
        }
    }

    public void setTowCap(double xtowCap)
    {
        if(xtowCap > 0)
        {
            this.towCap = xtowCap;
        }
    }

    //Methods
    public boolean equals()
    {
        return true;
    }

    public String toString()
    {
        return "Manufacturer: " + this.manuName + "\n# of Cylinders: " + this.cylinders+ "\nOwner: " + this.ownersName + "\nLoad Cap: " + this.loadCap + "\nTow Cap " + this.towCap;
    }
}   

