package ssm.blog.util.position;

import net.coobird.thumbnailator.geometry.Position;

import java.awt.*;

public class SmellerPos implements Position {
    @Override
    public Point calculate(int enclosingWidth, int enclosingHeight, int width, int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {

        int x =104;
        int y =1;
        return new Point(x, y);
    }
}
