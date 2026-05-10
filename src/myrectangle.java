public class myrectangle {
      public static void main(String[] args){
          rectangle r1= new rectangle();
          rectangle r2= new rectangle("blue");
          rectangle r3= new rectangle(5.0,4.3);
          rectangle r4=new rectangle("black",10.2,6.2);

          r1.setColour("Green");
          r1.setLength(5.6);
          r1.setWidth(6.4);

          displayRectangleInfo("rectangle 1", r1);
          displayRectangleInfo("rectangle 2", r2);
          displayRectangleInfo("rectangle 3", r3);
          displayRectangleInfo("rectangle 4", r4);
      }
      public static void displayRectangleInfo(String name,rectangle r){
          System.out.println("Colour: " + r.getColour());
          System.out.println("Length: " + r.getLength());
          System.out.println("Width: " + r.getWidth());
          System.out.println("Area: " + r.calculateArea());
          System.out.println("Perimeter: " + r.calculatePerimeter());
          System.out.println();
      }
}
