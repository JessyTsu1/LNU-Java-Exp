package EXP_4;

public class Manager extends Employee {
    private float bonus;
    Manager(int  _id, String  _name, float  _salary, float  _bonus){
        super(_id, _name, _salary);//调用父类构造方法
        bonus = _bonus;
    }
    //覆盖父类同名方法（方法声明完全相同）
    public float getSalary(int month){
        return month*basesalary+bonus;
    }

    public static void main(String args[]){
        int month = 12;
        Employee  employee = new Employee(1, "tom", 1000);
        Manager manager = new Manager(2, "John", 2000, 1000);
        System.out.println("employee :"+employee.getName()+" the total salary one year is"+employee.getSalary(month));
        System.out.println("manager: "+manager.getName()+" the total salary one year is"+manager.getSalary(month));
    }
}

