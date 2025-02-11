import java.awt.Color;
import java.awt.Graphics;

import java.util.ArrayList;

public class DrawGraphics {
    
    ArrayList<BouncingBox> boxes;
    
    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        boxes = new ArrayList<BouncingBox>();
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(50, 200, Color.PINK));
        boxes.add(new BouncingBox(150, 150, Color.YELLOW));
        boxes.get(0).setMovementVector(1, 0);
        boxes.get(1).setMovementVector(0, -2);
        boxes.get(2).setMovementVector(-2, 3);
    }

    /**
     * Draws the contents of the window on surface. Called 20 times per second.
     */
    public void draw(Graphics surface) {
        surface.drawLine(50, 100, 150, 100);
        surface.drawRect(75, 75, 50, 25);
        surface.drawArc(75, 62, 50, 25, 180, -180);
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }

} 