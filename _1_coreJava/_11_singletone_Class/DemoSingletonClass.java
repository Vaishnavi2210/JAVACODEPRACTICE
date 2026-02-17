package _1_coreJava._11_singletone_Class;

public class DemoSingletonClass {
    public static void main(String[] args) {
        // Singletone_Class s1 = new Singletone_Class();
        //  Singletone_Class s2 = new Singletone_Class();
        // Singletone_Class s3 = new Singletone_Class();

        _1_coreJava._11_singletone_Class.Singletone_Class s1 = _1_coreJava._11_singletone_Class.Singletone_Class.getInstance();
        _1_coreJava._11_singletone_Class.Singletone_Class s2 = _1_coreJava._11_singletone_Class.Singletone_Class.getInstance();
        _1_coreJava._11_singletone_Class.Singletone_Class s3 = Singletone_Class.getInstance();

    }
}