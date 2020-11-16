package EXP_5;
public class Employee {
    private int id;
    private String name;
    protected float basesalary;
    Employee(){
        this.id = 0;
        this.name = "no name";
        this.basesalary = 0.0f;
    }
    Employee(int  _id, String  _name, float  _salary){
        this.id = _id;
        this.name = _name;
        this.basesalary = _salary;
    }
    public float getSalary(int month){
        return month*basesalary;
    }
    public int getId(){return id;}
    public String getName(){return name;}
}