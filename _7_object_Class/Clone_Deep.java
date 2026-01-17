package _7_object_Class;

public class Clone_Deep {
    public static void main(String[] args) throws CloneNotSupportedException {

        class Address implements Cloneable{

            String street;
            String city;
            String Country;

            public Address(String street, String city, String Country) {
                this.street = street;
                this.city = city;
                this.Country = Country;
            }

            public Address() {
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", city='" + city + '\'' +
                        ", Country='" + Country + '\'' +
                        '}';
            }
        }

        class Student implements Cloneable{
            int id;
            String name;
            Address address;

            public Student() {

            }

            public Student(int id, String name, Address address) {
                this.id = id;
                this.name = name;
                this.address = address;
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
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

        Address address = new Address("baner", "pune", "ïndia");
        Student s1 = new Student(1, "Bhushan", address);
        Student s2 = (Student) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("deep copy");
        s2.address.city = "Mumbai";

        System.out.println(s1);
        System.out.println(s2);

    }
}
