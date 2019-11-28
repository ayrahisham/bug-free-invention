// Assignment 2 (Tetrahedron.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

public class Tetrahedron extends ThreeD
{
    Tetrahedron (double a)
    {
        super (a);
    }
    
    @Override
    public double area ()
    {
        return Math.sqrt(3) * Math.pow (a, 2);
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
    
    public double volume ()
    {
        return Math.pow (a, 3) / (6 * Math.sqrt(2));
    }
    
    public double getVolume ()
    {
        return volume ();
    }
    
    @Override
    public String toString ()
    {
        return String.format ( "%s%s%s%.3f%s%.3f%s%.3f",
                               "Tetrahedron (",
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
