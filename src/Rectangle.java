// Assignment 2 (Rectangle.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

public class Rectangle extends TwoD
{
    
    Rectangle (double length, double width)
    {
        super (length, width);
    }
    
    @Override
    public double area ()
    {
        return a * b;
    }
    
    @Override
    public double getArea ()
    {
        return area ();
    }
    
    @Override
    public double perimeter ()
    {
        return 2 * (a + b);
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
                               "Rectangle (",
                               super.toString (),
                               ") ==> area = ",
                               getArea (),
                               " and perimeter = ",
                               getPerimeter ()
                              );
    }
}

