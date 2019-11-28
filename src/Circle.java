// Assignment 2 (Circle.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

public class Circle extends TwoD
{
    Circle (double radius)
    {
        super (radius);
    }
    
    @Override
    public double area ()
    {
        return Math.PI * a * a;
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
    
    @Override
    public String toString ()
    {
        return String.format ( "%s%s%s%.3f%s%.3f",
                               "Circle (",
                               super.toString (),
                               ") ==> area = ",
                               getArea (),
                               " and circumference = ",
                               getPerimeter ()
                              );
    }
}
