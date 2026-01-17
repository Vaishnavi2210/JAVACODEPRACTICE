package _5_oops.encapsulation;

public class Encapsulation {

    private int age ;
    private String name ;

    private double Salary ;

    // getter setters
    public int getAge(){
        return age ;
    }

    void setAge(int age )
    {
        this.age = age ;
    }

    public  String getName(){
        return name ;
    }

    void setName(String name  )
    {
        this.name = name ;
    }

    public double getSalary(){
        return Salary ;
    }

    void setSalary(double salary)
    {
        if(salary >= 0 ){
            this.Salary = salary ;

        } else{
            System.out.println(" Invalid Salary ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Encapsulation H1 = new Encapsulation();

        H1.setAge(21);
        H1.setName("Bhuhsan");
        System.out.println(H1.getAge());
        System.out.println(H1.getName());


    }
}
