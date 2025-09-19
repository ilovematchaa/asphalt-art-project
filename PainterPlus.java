import org.code.neighborhood.*;

public class PainterPlus extends Painter{
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }

  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
  }
  public void moveFast(){
  while (canMove()) {
      move();
  }
  }
  public void paintLines(String color){
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
  }
  public void turnAround(){
    turnLeft();
    turnLeft();
  }
}