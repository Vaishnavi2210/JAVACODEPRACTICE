package _7_object_Class;

public class HashCode_Method {
    public static void main(String[] args)
    {
        // public native int hashCode();  // native - non java code

        /* 1. hashCode() - it is native means non-jave code
                         - hashCode method returns an integer value which is calculated based on memory address of given object.
                         - It is generated using[hashing] - (Converting nigger into smaller)
                         - If two or more reference is pointing to the same object their hashcode is same.


        */
        class A{

        }
        A ref1 = new A();
        A ref2 = new A();
        ref1 = ref2;

        //- It returns an integer value that represents the hash code of the object.
        System.out.println(ref1.hashCode()); //1595428806 ----> object address
        System.out.println(ref2.hashCode()); //1595428806 ----> object address

        // A hash code is basically a number used by hash-based collections (like HashMap, HashSet, Hashtable) to quickly locate objects.

        /*    return type of hashcode is - integer
         - By default, hashCode() returns a number based on the object’s memory address.
         -  That’s why two different objects usually have different hash codes, even if their contents are the same.
         */

        System.out.println(ref1.hashCode());//1595428806 ----> object address

        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toOctalString(8));
        System.out.println(Integer.toHexString(100));

        //converting decimal[1595428806] hashCode into hexadecimal[5f184fc6]
        System.out.println(Integer.toHexString(ref1.hashCode()));//5f184fc6


    }

}
