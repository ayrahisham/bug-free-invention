// Assignment 2 (Hexagon.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever

public class Hexagon extends TwoD 
{
    Hexagon (double side)
    {
        super (side);
    }
    
    @Override
    public double area ()
    {
        return (3 * Math.sqrt(3)) / 2 * Math.pow (a, 2);
    }
    
    @Override
    public double getArea ()
    {
        return area ();
    }
    
    @Override 
    public double perimeter ()
    {
        return 6 * a;
    }
    
    @Override
    public double getPerimeter ()
    {
        return perimeter ();
    }
    
    @Override
    public String toString ()
    {
        return String.format ( "%s%s%s%.3f%s%.3f",
                               "Hexagon (",
                               super.toString (),
                               ") ==> area = ",
                               getArea (),
                               " and perimeter = ",
                               getPerimeter ()
                              );
    }
}
