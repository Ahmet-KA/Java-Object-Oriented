package Inheritance;

public class Runner {

    public static void main(String[] args) {

        /* C class'ımdan yeni bir obje oluşturuyorum ve kurmuş oldugum
        multi-level inheritance yapı sayesinde objem üzerinden parentlarım olan sırasıyla B ve A
        classlarımın özelliklerine erişim sağlayıp kullanabilirim artık.
        */
        C object = new C();

        object.methodA();// A Class
        object.methodB();// B Class
        object.methodC();// C Class

        /*
        OUTPUT:
        A Class
        B Class
        C Class
         */
    }
}
