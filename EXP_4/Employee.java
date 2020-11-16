package EXP_4;

public class Employee{
    private int id;
    private String name;
    protected float basesalary;
    Employee(int  _id, String  _name, float  _salary){
        this.id = _id; this.name = _name; this.basesalary = _salary;
    }
    public float getSalary(int month){
        return month*basesalary;
    }
    public int getId(){return id;}
    public String getName(){return name;}
}