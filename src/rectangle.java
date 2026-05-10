 public class rectangle {
     private String colour = "yellow";
     private Double length = 1.0;
     private Double width  = 1.0;

     // first constructor
     public rectangle(String colour){
          this.colour=colour;
     }
     //second constructor
      public rectangle(Double length,Double width){
          this.length=length;
          this.width=width;
      }
      //third constructor
      public rectangle(String colour,Double length,Double width){
          this.colour=colour;
          this.length=length;
          this.width=width;
      }
      public rectangle(){

      }

      //accessors and mutators
      //accessors
      public String getColour(){
          return this.colour;
      }
      public Double getLength(){
          return this.length;
      }
      public Double getWidth(){
          return this.width;
      }

      //mutators

      public void setColour(String colour) {
           this.colour = colour;
      }
      public void setLength(Double length){
          this.length=length;
      }
      public void setWidth(Double width){
          this.width=width;
      }

      //area and perimeter
      public Double calculateArea(){
           return length * width;
      }
      public Double calculatePerimeter(){
          return 2 * length * width;
      }
 }