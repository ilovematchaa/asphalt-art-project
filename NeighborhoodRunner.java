import org.code.neighborhood.*;

public class NeighborhoodRunner extends PainterPlus{
  public static void main(String[] args) {

  BackgroundPainter audrey = new BackgroundPainter();
   audrey.setPaint(256);
    audrey.paintBackground("Maroon");
// This code segment makes the heart\\
    OutlinePainter a = new OutlinePainter();
    a.startPoint();
    a.setPaint(100);
    a.outlineShape("Black");
    a.insideHeart("DimGray");
// This code segment makes the eyes
  EyePainter t = new EyePainter();
  t.start();
    t.setPaint(40);
    t.redEyes("red");
    t.insideEyes("white");
  }
}

    