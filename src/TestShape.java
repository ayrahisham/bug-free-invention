// Assignment 2 (TestShape.java)
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
public class TestShape 
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
