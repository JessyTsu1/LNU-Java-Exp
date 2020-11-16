package EXP_3.KY3_1;

class StaticDemo {
    static int x;
    int y;
    private void private_method(){
        System.out.println("私有方法");
        System.out.println("静态变量x="+x);
        System.out.println("实例变量y="+y);
    }
    void method(){
        System.out.println("无修饰符方法");
        System.out.println("静态变量x="+x);
        System.out.println("实例变量y="+y);
    }
    public void public_method(){
        System.out.println("公有方法");
        System.out.println("静态变量x="+x);
        System.out.println("实例变量y="+y);
    }
    public static int getX() {
        return x;
    }
    public static void setX(int newX) {
        x = newX;
    }
    public int getY() {
        return y;
    }
    public void setY(int newY) {
        y = newY;
    }
}
public class KY3_1 {
    public static void main(String[] args) {
//静态成员
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.x=10;
        System.out.println("静态变量x="+staticDemo.getX());
        System.out.println("实例变量y="+staticDemo.getY()); // 非法，编译时将出错
        StaticDemo a= new StaticDemo();
        StaticDemo b= new StaticDemo();
        a.setX(1);
        a.setY(2);
        b.setX(3);
        b.setY(4);
        System.out.println("静态变量a.x="+a.getX());
        System.out.println("实例变量a.y="+a.getY());
        System.out.println("静态变量b.x="+b.getX());
        System.out.println("实例变量b.y="+b.getY());
//访问控制
//        Class clazz = StaticDemo.class;
//        StaticDemo method = clazz.getDeclaredMethod("private_method", KY3_1.class); //函数名，参数类型
//        method.setAccessible(true); method.invoke(clazz.newInstance(), (Object)rooms); //参数二：方法传入的具体值

        a.method();// 非法，编译时将出错
        a.method();
        a.public_method();
    }
}