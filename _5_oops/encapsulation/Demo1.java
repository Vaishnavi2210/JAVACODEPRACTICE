package _5_oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person();

        //if the data is non-private
        /*product.id = 101;
        product.name="Shubham";*/
        //person.age=-100;

        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.setId(101);
        person.setName("Shubham");
        person.setAge(100);
        System.out.println("after setting the values");
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
