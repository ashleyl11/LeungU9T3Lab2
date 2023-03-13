import java.awt.*;

public class Line extends Shape {
    public Line(){
        super();
    }

    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawLine(getP1().x, getP1().y, getp2().x, getp2().y);
    }
}
