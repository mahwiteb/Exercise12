enum ShapesEnum {
    SQUARE(4), RECTANGLE(4), CIRCLE(0), TRAPEZOID(4), RHOMBUS(4),
    TRIANGLE(3), OVAL(0), HEXAGON(6);

    final int count;

    ShapesEnum(int count) {
        this.count = count;
    }
}

public class Main {

    public static void main(String[] args) {
        ShapesEnum se = ShapesEnum.TRIANGLE;
        Run.RunCode(se);
    }
}
