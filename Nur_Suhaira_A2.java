// Assignment 2 (Nur_Suhaira_A2.java)
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever

// Convenient to design, feel free to add in 
// more useful methods, even more classes 
// but not to remove any method from the UML diagrams.  

// In the main method, define an array of Shapes (at least 6) 
// references to objects of each concrete class in 
// the hierarchy (process the Shape objects polymorphically). 
// The program should print out at least six kinds of 
// information.  

class TestShape 
{
    public static void main (String [] args)
    {
        Circle c0 = new Circle (5.6);
        Rectangle r0 = new Rectangle (3.5, 6.8);
        Triangle t0 = new Triangle (2.0, 3.0, 4.0);
        Hexagon x0 = new Hexagon (5.0);
        Sphere s0 = new Sphere (8.8);
        Cube b0 = new Cube (7.8);
        Tetrahedron h0 = new Tetrahedron (1.8);
        Cylinder y0 = new Cylinder (2.4, 6.7);
        
        Shape [] shape = new Shape [8]; 
        
        shape [0] = c0;
        shape [1] = r0;
        shape [2] = t0;
        shape [3] = x0;
        shape [4] = s0;
        shape [5] = b0;
        shape [6] = h0;
        shape [7] = y0;
        
        
        int index = 0;
        System.out.printf ("%s%s%n%n",
                            "An Array of Shapes consisting ",
                            "of Concrete Class objects:");
        for (Shape i: shape)
        {
            
            System.out.printf ( "Shape[%d%s%s%n",
                                index,
                                "] = ",
                                i
                               );
            index++;
        }
    }
}

interface Shape 
{
    public double area ();
    public double getArea ();
    public double perimeter ();
    public double getPerimeter ();
}

// Each TwoDimensionalShape should contain methods area 
// and getArea to calculate and 
// to return the area of the two-dimensional shape.
abstract class TwoD implements Shape
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

class Circle extends TwoD
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

class Rectangle extends TwoD
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

class Triangle extends TwoD
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

class Hexagon extends TwoD 
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

// Each ThreeDimensionalShape should have methods area, 
// getArea, volume and getVolume to calculate 
// and to return the Rectangle surface area and 
// the volume, respectively, of the three-dimensional shape.
abstract class ThreeD implements Shape
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

class Cube extends ThreeD
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

class Cylinder extends ThreeD 
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

class Sphere extends ThreeD
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

class Tetrahedron extends ThreeD
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
