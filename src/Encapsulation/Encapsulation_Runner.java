package Encapsulation;

public class Encapsulation_Runner {

    public static void main(String[] args) {

        Encapsulation_Class encapsulation = new Encapsulation_Class();//Encapsulation class'ımdan yeni bir obje üretiyorum.

        encapsulation.setMarkaCar("Honda");
        encapsulation.setModelCar("Civic");
        encapsulation.setModelYear("2011");
        /*
        private olarak tanımlanan class üyeleri set methodu ile deger ataması yaptım
        Normalde private tanımlı class üyesi sadece o class da geçerliydi.Ama Encapsulation set method
        sayesinde class üyesine erişim sağlayıp deger ataması yapabildim.Şimdi get method ile onu çağırabilirim artık.
        Burda dikkat etmemiz gereken class üyesi colorCar public olarak tanımlandı.
         */

        System.out.println("Marka : " + encapsulation.getMarkaCar() +"\n" +
                "Model : " + encapsulation.getModelCar() + "\n" +
                "Renk : " + encapsulation.getColorCar() + "\n" +
                "Model Yılı : " + encapsulation.getModelYear());

        /*
        OUTPUT:
        Marka : Honda
        Model : Civic
        Renk : Kırmızı
        Model Yılı : 2011
         */
    }
}
