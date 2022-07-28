package Chap_2;

public class Line {
     private Point startingPoint;
     private Point endingPoint;


     public Line(Point sPoint, Point ePoint){
          this.startingPoint= sPoint;
          this.endingPoint = ePoint;
     }

     public double gradient(){
        double y_diff = this.startingPoint.y -this.endingPoint.y;
        double x_diff = this.startingPoint.x - this.endingPoint.x;
        double gradient = y_diff/x_diff;
        return gradient;
     }

     public double lineLength(){
        //double y_diff = this.startingPoint.y -this.endingPoint.y;
        // double x_diff = this.startingPoint.x - this.endingPoint.x;
        // double y_diffSquare = y_diff*y_diff;
         //double x_diffSquare = x_diff*x_diff;
        // double theLength =Prac.Math.sqrt(y_diffSquare+x_diffSquare);
        // return theLength;
         double y_diffSquare = Math.pow(this.startingPoint.y -this.endingPoint.y, 2);
         double x_diffSquare = Math.pow(this.startingPoint.x - this.endingPoint.x, 2);
         double theLength =Math.sqrt(y_diffSquare + x_diffSquare);
         return theLength;


         }
     }






