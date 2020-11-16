package EXP_5;

public class Manager extends Employee{
    private float bonus;
    Manager(){}
    {
        this.bonus=0;
    }
    Manager(int  _id, String  _name, float  _salary, float  _bonus){
        super(_id, _name, _salary);
        bonus = _bonus;
    }
    public float getBonus(){return bonus;}
    //覆盖父类同名方法（方法名和参数列表完全相同）
    public float getSalary(int month){
        return month*basesalary+bonus;	}
    public static void main(String args[]){
        Manager man1 = new Manager(1, "John", 2000, 1000);
        Manager man2 = new Manager();
        System.out.println("employee "+man1.getName()+" the total salary one year is"+man1.getSalary(12));
        System.out.println("employee "+man2.getName()+" the total salary one year is"+man2.getSalary(12));
    }
}