package Lab10;
//Jacob Webster
public class Vehicle {

    //Instance Variables
    public String manuName;
    public int cylinders;
    public String ownersName;

    //Default Constructor
    public Vehicle()
    {
        this.manuName = "";
        this.cylinders = 0;
        this.ownersName = "";
    }

    //Parameterized Constructor
    public Vehicle(String xmanuName, int xcylinders, String xownersName)
    {
        this.setManuName(xmanuName);
        this.setCylinders(xcylinders);
        this.setOwnersName(xownersName);
    }

    //Accessors
    public String getManuName()
    {
        return this.manuName;
    }

    public int getCylinders()
    {
        return this.cylinders;
    }

    public String getOwnersName()
    {
        return this.ownersName;
    }

    //Mutators
    public void setManuName(String xmanuName)
    {
        this.manuName = xmanuName;
    }

    public void setCylinders(int xcylinders)
    {
        if (xcylinders > 0)
        {
            this.cylinders = xcylinders;
        }
    }

    public void setOwnersName(String xownersName)
    {
        this.ownersName = xownersName;
    }

    //Methods
    public String toString()
    {
        return "Manufacturer: " + this.manuName + "\n# of Cylinders: " + this.cylinders+ "\nOwner: " + this.ownersName;
    }
}
