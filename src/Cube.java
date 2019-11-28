// Assignment 2 (Cube.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

public class Cube extends ThreeD
{
    Cube (double a)
    {
        super (a);
    }
    
    @Override
    public double area ()
    {
        return 6 * Math.pow (a, 2);
    }
    
    @Override
    public double getArea ()
    {
        return area ();
    }
    
    @Override
    public double perimeter ()
    {
        return 12 * a;
    }
    
    @Override
    public double getPerimeter ()
    {
        return perimeter ();
    }
    
    public double volume ()
    {
        return Math.pow (a, 3);
    }
    
    public double getVolume ()
    {
        return volume ();
    }
    
    @Override
    public String toString ()
    {
        return String.format ( "%s%s%s%.3f%s%.3f%s%.3f",
                               "Cube (",
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
