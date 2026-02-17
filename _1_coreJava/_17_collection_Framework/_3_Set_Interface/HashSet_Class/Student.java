package _1_coreJava._17_collection_Framework._3_Set_Interface.HashSet_Class;
// HashSet with Custom Object (INTERVIEW FAVORITE)
public class Student {
    int id;
    String name;

    @Override
    public int hashCode(){
        return id;
    }

    public  boolean equals(Object o){
        Student s = (Student)o;
        return this.id == s.id;
    }

    public static void main(String[] args) {


    }

}
