package _3_classComponents.NestedClasses;

public class ConstantDemo4 {
    public static void main(String[] args) {
        // Access constant of Mysql

        System.out.println("*************** MySQL *****************");

        System.out.println("mysql dev username = " + Constants.Mysql.Dev.username);
        System.out.println("mysql dev password = " + Constants.Mysql.Dev.password);

        System.out.println("mysql QA username = " + Constants.Mysql.QA.username);
        System.out.println("mysql QA username = " + Constants.Mysql.QA.username);

        System.out.println("mysql Prod username = " + Constants.Mysql.Prod.username);
        System.out.println("mysql Prod username = " + Constants.Mysql.Prod.username);



        System.out.println("*************** Oracle *****************");

        System.out.println("Oracle dev username = " + Constants.Oracle.Dev.username);
        System.out.println("oracle dev password = " + Constants.Oracle.Dev.password);

        System.out.println("Oracle QA username = " + Constants.Oracle.QA.username);
        System.out.println("Oracle QA username = " + Constants.Oracle.QA.username);

        System.out.println("Oracle Prod username = " + Constants.Oracle.Prod.username);
        System.out.println("Oracle Prod username = " + Constants.Oracle.Prod.username);

    }
}

