package groupProject2;

public interface Shape {

    /*
        Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
        Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
        Test your code.
     */

    double radius = 15.6;
    double y = 9;

    void calculateArea();

    void calculatePerimiter();

}
class Circle implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("The Area of a Circle is " + Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void calculatePerimiter(System.out.println("The Perimeter of a Circle is  " + Math.PI * 2 * radius);)

    {
    }
    }
    @Override
    public void culculatePerimiter() {

    }
}
  class Square implements Shape  {

        @Override
        public void calculateArea() {
            System.out.println("The Area of a Square is " + Math.pow(y,2));
         }

         @Override
         public void calculatePerimiter() {
          System.out.println("The Perimeter of the Square is " +4*y);
      }

       }






