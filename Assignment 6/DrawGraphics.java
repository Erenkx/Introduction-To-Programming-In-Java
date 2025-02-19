import java.awt.Color;
import java.awt.Graphics;

import java.util.ArrayList;

public class DrawGraphics {

    ArrayList<Mover> movers;

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        movers = new ArrayList<Mover>();

        Rectangle box = new Rectangle(25, 30, Color.RED);
        Bouncer bouncer = new Bouncer(100, 170, box);
        bouncer.setMovementVector(3, 1);

        Oval oval = new Oval(25, 30, Color.YELLOW);
        Bouncer anotherBouncer = new Bouncer(50, 50, oval);
        anotherBouncer.setMovementVector(-2, -3);

        Rectangle box2 = new Rectangle(25, 30, Color.GREEN);
        StraightMover straightMover = new StraightMover(70, 100, box2);
        straightMover.setMovementVector(2, 2);

        Oval oval2 = new Oval(25, 30, Color.PINK);
        StraightMover anotherStraightMover = new StraightMover(170, 100, oval2);
        anotherStraightMover.setMovementVector(-2, 3);

        movers.add(bouncer);
        movers.add(anotherBouncer);
        movers.add(straightMover);
        movers.add(anotherStraightMover);
    }

    /**
     * Draws the contents of the window on surface.
     */
    public void draw(Graphics surface) {
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }

}
