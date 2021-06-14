import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class main {
    public static void main(String[] args) {
        System.out.println("The Snake Game");

        Frame frame  = new Frame();
        frame.add(new CustomPaintComponent());

        int frameWidth = 300;
        int frameHeight = 300;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }

    static class CustomPaintComponent extends Component {
        public void paint(Graphics g) {
            //this is use to draw object
            Graphics2D g2d = (Graphics2D)g;
            // new 2d object
            int x = 0;
            int y = 0;
            int w = 10;
            int h = 10;

            g2d.drawRect(150, 150, w, h);
        }
    }
}
