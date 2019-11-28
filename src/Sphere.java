// Assignment 2 (Sphere.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

public class Sphere extends ThreeD
{
    Sphere (double a)
    {
        super (a);
    }
    
    @Override
    public double area ()
    {
        return 4 * Math.PI * Math.pow (a, 2);
    }
    
    @Override
    public double getArea ()
    {
        return area ();
    }
    
    @Override
    public double perimeter ()
    {
        return 2 * Math.PI * a;
    }
    
    @Override
    public double getPerimeter ()
    {
        return perimeter ();
    }
    
    public double volume ()
    {
        return 4 / 3 * Math.PI * Math.pow (a, 3);
    }
    
    public double getVolume ()
    {
        return volume ();
    }
    
    @Override
    public String toString ()
    {
        return String.format ( "%s%s%s%.3f%s%.3f%s%.3f",
                               "Sphere (",
                               super.toString (),
                               ") ==> surface area = ",
                               getArea (),
                               ", circumference = ",
                               getPerimeter (),
                               " and volume = ",
                               getVolume ()
                              );
    }
}
