// Assignment 2 (TwoD.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

// Each TwoDimensionalShape should contain methods area 
// and getArea to calculate and 
// to return the area of the two-dimensional shape. 
public abstract class TwoD implements Shape
{
    protected double a;
    protected double b;
    protected double c;
    
    TwoD (double a)
    {
        this.a = a;
    }
    
    TwoD (double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    
    TwoD (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String toString ()
    {
        if (b == 0)
        {
            return String.format ( "%s%.1f%s",
                                   "2D (",
                                    a,
                                    ")"
                                 );
        }
        else if (c == 0)
        {
            return String.format ( "%s%.1f%s%.1f%s",
                                   "2D (",
                                    a,
                                    ", ",
                                    b,
                                    ")"
                                 );
        }
        else
        {
            return String.format ( "%s%.1f%s%.1f%s%.1f%s",
                                   "2D (",
                                    a,
                                    ", ",
                                    b,
                                    ", ",
                                    c,
                                    ")"
                                 );
        }
    }
    
}