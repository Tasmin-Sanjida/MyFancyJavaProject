import java.util.Scanner;  
public class TestClass 
{  
public static void main(String[] args)  
{  
int m, j, row;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows you want to print: ");  
row = sc.nextInt();          
for (m= 0; m<= row-1; m++)  
{
System.out.println("");
for (j=0; j<=m; j++)   
{  
System.out.print("*"+ " ");
}  
} 
System.out.println(""); 
for (m=row-1; m>=0; m--)  
{  
for(j=0; j <= m-1;j++)  
{  
System.out.print("*"+ " ");  
}  
System.out.println("");  
}  
}  
}


package creational.pattern;

interface Shape
{
    void draw();
}


class Circle implements Shape
{
     @Override
     public void draw()
     {
         System.out.println("a circle drawn");
     }
}


class Square implements Shape
{
     @Override
     public void draw()
     {
         System.out.println("a square drawn");
     }
}

class Rectangle implements Shape
{
     @Override
     public void draw()
     {
         System.out.println("a rectangle drawn");
     }
}


class ShapeFactory
{
 
     public Shape getShape(String type) throws Exception
     {
         switch (type)
         {
             case "Circle":
                 return new Circle();
             case "Square":
                 return new Square();
             case "Rectangle":
                 return new Rectangle();
             default:
                 throw new Exception( "Shape type : "+type+" cannot be instantiated");
         }
     }
}

class Painter
{
     public static void main(String[] args) throws Exception
     {
         
         ShapeFactory shapeFactory = new ShapeFactory();
         Shape circle=shapeFactory.getShape("Circle");
         circle.draw();
         Shape square = shapeFactory.getShape("Square");
         square.draw();
         
         Shape rombus = shapeFactory.getShape("Rombus");
         rombus.draw();
     }
}

/* Sir,i have some family issues.For this reason, i have to go to outside the Dhaka.That's why today i have finished my assignment part. */