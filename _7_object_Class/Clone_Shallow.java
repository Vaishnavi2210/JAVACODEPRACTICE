package _7_object_Class;

public class Clone_Shallow {
    public static void main(String[] args) throws CloneNotSupportedException{
        class Address implements Cloneable{
            String street;
            String city;
            String country;

            public Address (String street, String city, String country){
                this.street = street;
                this.city = city;
                this.country = country;
            }

            public Address(){

            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", city='" + city + '\'' +
                        ", country='" + country + '\'' +
                        '}';
            }
        }

        class Student implements Cloneable{
            int id;
            String name;
            Address address;

            public Student (int id, String name, Address address){
                this.id = id;
                this.name = name;
                this.address = address;
            }

            public Student(){
            }

            @Override
            public Object clone() throws CloneNotSupportedException{
                return super.clone();
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", address=" + address +
                        '}';
            }
        }

        Address address = new Address("Baner", "Pune", "India");
        Student s1 = new Student(1,"bhushan", address);
        Student s2 =(Student)s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Shallow copy");
        s2.address.city = "Mumbai";

        System.out.println(s2);
        System.out.println(s1);
    }
}
