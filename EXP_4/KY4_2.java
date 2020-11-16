package EXP_4;

public class KY4_2 extends KY4_1_P{
    protected String xy;
    protected String xi;
    public static void main(String args[]){
        KY4_1_P p1 = new KY4_1_P();
        p1.setdata("甲",1);
        KY4_2 p2 = new KY4_2();
        p2.setdata("乙",2);
        p2.xy="经济管理";
        p2.xi="信息管理";
        p1.print();
        p2.print();
        System.out.print(p2.xm+","+p2.xy+","+p2.xi);
    }
}
