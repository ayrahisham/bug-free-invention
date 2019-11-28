// Assignment 2 (ThreeD.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

// Each ThreeDimensionalShape should have methods area, 
// getArea, volume and getVolume to calculate 
// and to return the Rectangle surface area and 
// the volume, respectively, of the three-dimensional shape.
public abstract class ThreeD implements Shape
{
    protected double a;
    protected double b;
    
    ThreeD (double a)
    {
        this.a = a;
    }
    
    ThreeD (double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString ()
    {
        if (b == 0)
        {
            return String.format ( "%s%.1f%s",
                                   "3D (",
                                    a,
                                    ")"
                                 );
        }
        else
        {
            return String.format ( "%s%.1f%s%.1f%s",
                                   "3D (",
                                    a,
                                    ", ",
                                    b,
                                    ")"
                                 );
        }
     }
}