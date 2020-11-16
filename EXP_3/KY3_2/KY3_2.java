package EXP_3.KY3_2;

public class KY3_2 {
    public static void main(String[] args) {
        int x=10, y=10;
        power(x, y);
        System.out.println("x="+x+", y="+y);
    }
    static void power(int passX, int passY) {
        passX=passX*passX;
        passY=passY*passY;
        System.out.println("passX="+passX+", passY="+passY);
    }
}