// Assignment 2 (Cylinder.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my pr//ogram to my friends
// and willing to accept whatever 

public class Cylinder extends ThreeD 
{
    
    Cylinder (double radius, double height)
    {
        super (radius, height);
    }
    
    @Override
    public double area ()
    {
        return 2 * Math.PI * a * b + 2 * Math.PI * Math.pow (a, 2);
    }
    
    @Override
    public double getArea ()
    {
        return area ();
    }
    
    @Override
    public double perimeter ()
    {
        return 2 * 2 * Math.PI * a + 2 * b;
    }
    
    @Override
    public double getPerimeter ()
    {
        return perimeter ();
    }
    
    public double volume ()
    {
        return Math.PI * Math.pow (a, 2) * b;
    }
    
    public double getVolume ()
    {
        return volume ();
    }
    
    @Override
    public String toString ()
    {
        return String.format ( "%s%s%s%.3f%s%.3f%s%.3f",
                               "Cylinder (",
                               super.toString (),
                               ") ==> surface area = ",
                               getArea (),
                               ", perimeter = ",
                               getPerimeter (),
                               " and volume = ",
                               getVolume ()
                              );
    }
}
