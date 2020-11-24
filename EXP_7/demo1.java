package EXP_7;

import java.util.*;
public class demo1 {
    public static void main(String[] args) {
//        ArrayList<Clerk> al=new ArrayList<Clerk>();
        HashMap<String,Clerk> al=new HashMap<String, Clerk>();
        //创建一个职员
        Clerk clerk1=new Clerk("AAA",50,1000);
        Clerk clerk2=new Clerk("BBB",45,1200);
        al.put("clerk1",clerk1);
        al.put("clerk2",clerk2);
        //遍历al所有的对象(数据)
        for(Map.Entry<String,Clerk> entry: al.entrySet()){
            System.out.println("名字："+entry.getValue().getName()+"年龄"+entry.getValue().getAge()+"薪水"+entry.getValue().getSal());
        }
    }
}

class Clerk{
    private String name;
    private int age;
    private float sal;
    public Clerk(String name,int age,float sal){
        this.name=name;
        this.age=age;
        this.sal=sal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSal() {
        return sal;
    }
    public void setSal(float sal) {
        this.sal = sal;
    }
}