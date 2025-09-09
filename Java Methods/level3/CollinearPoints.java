public class CollinearPoints {
    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Points are collinear by slope method: " + collinearBySlope);
        System.out.println("Points are collinear by area method: " + collinearByArea);
    }
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB_num = y2 - y1;
        int slopeAB_den = x2 - x1;
        int slopeBC_num = y3 - y2;
        int slopeBC_den = x3 - x2;
        int slopeAC_num = y3 - y1;
        int slopeAC_den = x3 - x1;
        boolean ab_bc_equal = slopeAB_num * slopeBC_den == slopeBC_num * slopeAB_den;
        boolean bc_ac_equal = slopeBC_num * slopeAC_den == slopeAC_num * slopeBC_den;
        return ab_bc_equal && bc_ac_equal;
    }
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }
}
