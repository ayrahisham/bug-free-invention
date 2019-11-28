// Assignment 2 (Triangle.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

public class Triangle extends TwoD
{
    Triangle (double a, double b, double c)
    {
        super (a, b, c);
    }
    
    @Override
    public double area ()
    {
        double x = (a + b + c) / 2.0;
        return Math.sqrt (x * (x - a) * (x - b) * (x - c));
    }
    
    @Override
    public double getArea ()
    {
        return area ();
    }
    
    @Override
    public double perimeter ()
    {
        return a + b + c;
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
                               "Triangle (",
                               super.toString (),
                               ") ==> area = ",
                               getArea (),
                               " and perimeter = ",
                               getPerimeter ()
                              );
    }
}
