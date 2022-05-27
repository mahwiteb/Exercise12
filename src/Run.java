public class Run {
    public static void RunCode(ShapesEnum se) {
        if (se.count >= 0) {
            System.out.println(String.format("%s has %s cornors.",
                    se.name(), se.count));
        } else {
            System.out.println("Sorry, we can't read that shape.");
        }
    }
}
