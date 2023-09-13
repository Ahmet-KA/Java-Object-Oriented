package Pollymorhism;

public class CarSeller {

    public static void main(String[] args) {

        /*
        Overloading : Aynı class'da aynı isim ve farklı signature ile birden fazla
        method kullanımına olanak verir
         */

        // objemizin data türü Carseller constructor da CarSeller oldugu için CarSeller
        // class da fuel method var mı diye bakar ve varsa çalıştırır.
        CarSeller carSeller = new CarSeller();
        carSeller.fuel();// İstenilen yakit buşunur
        carSeller.fuel(2015);// Year: 2015
        carSeller.fuel(2016,5.3);// Year: 2016 MaxTüketim: 5.3

        /*
        Overriding : Parent class'da var olan bir method'un child class'da aynı isim ve signature'ye
        sahip bir method tarafından geçersiz kılınması.
         */

        //Car class'ından obje oluşturulması ve car class'ında fuel methodun kullanımı
        Car car = new Car();
        car.fuel();// Araclarda motora uygun yakıt kullanılır.

        //carGasoline objemizin data türü Car oluşturulan constructor GasolineCar
        //Bu durumda aralarında parent child ilişki bulunmakta
        //fuel methodu parentta varmı diye ve child'da override edilmesini kontrol eder
        //Method override edildiyse child'da o methodu çalıştırır.
        Car carGasoline = new GasolineCar();
        carGasoline.fuel();// Benzinli arabalar için uygun yakıt
        //carGasoline.fuel(6.8) parent da double parametreli bir fuel method bulunmadıgı için
        //child method'da olsa dahi kabul etmeyip çalışmayacaktır.Alltaki kod bu yüzden çalışmaz
        //carGasoline.fuel(6.8);

        Car carDiesel = new DieselCar();
        carDiesel.fuel();// Dizel arabalar için uygun yakıt
        //carDiesel.fuel("Kırmızı");

        Car carElektric = new ElectricCar();
        carElektric.fuel();// Elektrikli arabalar için uygun yakıt

        /*
        output:
        İstenilen yakit buşunur
        Year: 2015
        Year: 2016 MaxTüketim: 5.3
        Araclarda motora uygun yakıt kullanılır.
        Benzinli arabalar için uygun yakıt
        Dizel arabalar için uygun yakıt
        Elektrikli arabalar için uygun yakıt
         */

    }

    public void engine(){
        System.out.println("İstenilen motor bulunur");
    }
    public void fuel(){
        System.out.println("İstenilen yakit buşunur");
    }
    public void fuel(double maxConsumption){
        System.out.println("Max Tüketim: " + maxConsumption);
    }
    public void fuel(int year){
        System.out.println("Year: " + year);
    }
    public void fuel(int year,double maxConsumption){
        System.out.println("Year: " + year + " " + "MaxTüketim: " + maxConsumption);
    }
}
