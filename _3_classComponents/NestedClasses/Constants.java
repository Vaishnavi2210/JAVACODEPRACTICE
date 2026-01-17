package _3_classComponents.NestedClasses;

public class Constants {

    static class Mysql{
    static class Dev{
        public static  String username = "mysql_dev";
        public static  String password = "mysql_dev_pass";
    }

    static class QA{
        public static  String username = "mysql_qa";
        public static  String password = "mysql_qa_pass";
    }

    static class Prod {
        public static  String username = "mysql_prod";
        public static  String password = "mysql_prod_pass";
    }

  }

     static class Oracle{
        static class Dev{
            public static  String username = "oracle_dev";
            public static  String password = "oracle_dev_pass";
        }

        static class QA{
            public static  String username = "oracle_qa";
            public static  String password = "oracle_qa_pass";
        }

        static class Prod {
            public static  String username = "oracle_prod";
            public static  String password = "oracle_prod_pass";
        }

  }
}
