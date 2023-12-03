class Person
{
    String name;
    int age;
    char gender;
    Person(String name,int age,char gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}


class Employee extends Person
{
    
    int eid;
    double salary;
    String compname;

    Employee(String name,int age,char gender,int eid,double salary,String compname)
    {
        super(name,age,gender);
        this.eid=eid;
        this.salary=salary;
        this.compname=compname;

        System.out.println("name: "+name+"\nage :"+age+"\ngender :"+gender+"\neid: "+eid+" \nsalary: "+salary+"\ncomp name: "+compname);
    }
}

class Mainclass
{
    public static void main(String[] args) {
       Employee e=new Employee("suresh",22,'m',1234,50000.0,"hcl");
      
    }
}