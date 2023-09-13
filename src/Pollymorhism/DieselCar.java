package Pollymorhism;

public class DieselCar extends Car{

    //Overriding
    public void engine(){
        System.out.println("Dizel arabalar için kullanılan motor");
    }
    //Overriding
    public void fuel(){
        System.out.println("Dizel arabalar için uygun yakıt");
    }

    //Overloading
    public void fuel(String color){
        System.out.println("Dizel arabalarda iki renk seçeneği vardır");
        if (color.equalsIgnoreCase("Beyaz") ||
           color.equalsIgnoreCase("Kırmızı") ||
           color.equalsIgnoreCase("Mavi")){
            System.out.println("İsteğiniz renkte diesel araç mevcut.");
        }else{
            System.out.println("İstediğiniz renkte diesel araç bulunmamaktadır");
        }
    }
}
