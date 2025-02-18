public class Abstraction {
    abstract class Shape {
        abstract void draw();
        
    }
    
    class Circle extends Shape
    { 
        void draw(){
    
        System.out.println("Shape of the circle");
    }
    }
    class Rectangle extends Shape{
        
        void draw()
        {
            System.out.println("Shape of the Rectangle");
        }
    }
    class Triangle extends Shape{
        
        void draw()
        {
            System.out.println("Shape of the Triangle");
        }
    }
    class Square extends Shape{
        
        void draw()
        {
            System.out.println("Shape of the Square");
        }
    }
    class Hexagon extends Shape{
        
        void draw()
        {
            System.out.println("Shape of the Hexagon");
        }
    }
    
    public class AbstractionExample {
        public static void main(String[] args) {
          Shape circle = new Circle();
          Shape rectangle = new Rectangle();
          Shape triangle = new Triangle();
          Shape square = new Square();
          Shape hexagon = new Hexagon();  
    
          circle.draw();
          rectangle.draw();
          triangle.draw();
          square.draw();
          hexagon.draw();
        }
    }
    
    
}
