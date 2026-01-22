public class overlaprectangles {
    static boolean isoverlap(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        if (x1 >= x4 || x3 >= x2)
            return false;

        if (y2 >= y3 || y4 >= y1)
            return false;

        return true;

    }

    public static void main(String[] args) {
        int x1 = 0, y1 = 10;
        int x2 = 10, y2 = 0;

        int x3 = 5, y3 = 5;
        int x4 = 15, y4 = -5;

        if (isoverlap(x1, y1, x2, y2, x3, y3, x4, y4))
            System.out.println("Rectangles Overlap");
        else
            System.out.println("Rectangles Do Not Overlap");

    }

}
