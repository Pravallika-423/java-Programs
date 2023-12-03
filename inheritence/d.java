class Employee
{
    double salary=30000;
    int age=24;
}
class person{
    String name="mark";
    int age=23;
}
class Person2 extends Employee ,Person{
    public static void main(String[] args) {
        Person2 p2=new Person2();
        System.out.println(p2.age);
        System.out.println(p2.salary);
        
    }
}