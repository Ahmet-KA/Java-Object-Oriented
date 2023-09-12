package Constructor;

public class CarRunner {

    public static void main(String[] args) {

        Car car = new Car();

        /*
        Burada;
        Car :Objemizi oluşturdugumuz class ismi
        car :Obje ismimiz
        new :Obje oluşturmada kullandıgımız new keyword
        Car():Class'ımızda tanımladıgımız parametresiz constructor

        new keyword ile Car classımdan parametresiz constructor'ı çağırarak bir obje oluşturdum.
        Artık bu obje ile class'ımın tüm özelliklerine ulaşabilirim.
         */

        System.out.println(car.marka);// Toyota
        System.out.println(car.model);// Auris
        System.out.println(car.modelYear);// 2017

        /*

        Parametresiz constructor ile objemizin tüm özelliklerine tek tek ulaşabildik ve class tanımında atanan degerlerini yazdırmış olduk.
        Şimdi bunu constructor'ların bize sağlamış oldugu özelliği olan parametreli constructor ile gerçekleştirelim.

         */

        Car yeniCar = new Car("Renault","Megane",2020);

        //Yukarıda ki işlemimi bu sefer parametreli constructor'ımı çağırıp paremetrelerini yani yeni degerlerimi vererek artık yeni özelliklere sahip objeme atamış oldum.

        System.out.println(yeniCar.marka);// Renault
        System.out.println(yeniCar.model);// Megane
        System.out.println(yeniCar.modelYear);// 2020

        System.out.println(yeniCar);
        /*
        Renault
        Megane
        2020
        override edilen toString method yardımıyla yazdırım.
         */
    }
}
