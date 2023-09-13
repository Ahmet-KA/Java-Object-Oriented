package Pollymorhism;

public class GasolineCar extends  Car{

    public void engine(){
        System.out.println("Benzinli arabalar için kullanılan motor");
    }
    public void fuel(){
        System.out.println("Benzinli arabalar için uygun yakıt");
    }
    public void fuel(double consumption){
        System.out.println("Benzinli arabalar ortalama 5,4 lt yakıt tüketir");

        if (consumption<5.4){
            System.out.println("Benzinli bir araba alabilirsiniz");
        }else {
            System.out.println("Size uygun bir araba bulunamadı");
        }
    }
}
