package EXP_3.KY3_3;

public class KY3_3 {
    public static void main(String[] args) {
        KY3_3 ex = new KY3_3();
        Counter counter = new Counter(10);
        ex.addcount(counter);
        counter.printcount();
    }
    void addcount(Counter mycounter)
    {
        mycounter.add();
    }
}
class Counter{
    private int num;
    Counter(int  _init){ num = _init;}
    public void add(){num++;}
    public void printcount(){System.out.println("The number of counter is "+num);}
}
