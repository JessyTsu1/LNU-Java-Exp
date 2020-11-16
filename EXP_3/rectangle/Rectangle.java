package EXP_3.rectangle;
import java.util.Scanner;

public class Rectangle {
    private float length;
    private float width;

    public void Rectangle(){
        length = 0;
        width = 0;
    }

    public void Rectangle(float length, float width){
        if(length < 0){
            throw new RuntimeException("length 不能小于0");
        }
        if(width < 0){
            throw new RuntimeException("width 不能小于0");
        }
        this.length = length;
        this.width = width;
    }

    public float calculate_circum(){
        return (length + width)*2;
    }

    public float calculate_area(){
        return length * width;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入length：");
            int length = scanner.nextInt();
            System.out.println("请输入width：");
            int width = scanner.nextInt();
            Rectangle rectangle = new Rectangle();
            rectangle.Rectangle(length, width);
            System.out.println("area: " + rectangle.calculate_area());
            System.out.println("circum: " + rectangle.calculate_circum());
            System.out.println("\n");
        }
    }
}
