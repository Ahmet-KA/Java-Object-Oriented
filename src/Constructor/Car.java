package Constructor;

public class Car {

    //Car nesnemizin özellikleri

    String marka = "Toyota";
    String model = "Auris";
    int modelYear = 2017;

    /*
    1-Constructor'lar class ismi ile aynı olup return type'ları yoktur.Oluşturmuş oldugumuz class'lar
    üzerinden üreteceğimiz objelere ait özelliklerin ilk deger atamalarını constructor ile yapabilmekteyiz.

    2-Java'da biz bir class oluşturdugumuzda otomatik olarak default bir constructor oluşturulur.

     public Car() {
     Biz her ne kadar görmesekte Classımızı oluşturdugumuzda oluşan default constructor tanımı bu şekildedir.
    }

    Başka classlarımızda Classımızdan oluşturacagımız herbir obje için artık özelliklerimize deger ataması gerçekleştirebiliriz.

    3-Car class'ımızın özelliklerini class tanımında da atayabileceğimiz gibi class özelliklerini
    parametre olarak alan bir constructor tanımlayarak da yapabiliriz.

    public Car(String marka, String model, int modelYear) {
        this.marka = marka;
        this.model = model;
        this.modelYear = modelYear;
    }

    Artık classımızda tüm özelliklerini parametre olarak alan bir constructor var ve diğer classlarımızda oluşturacagımız objeler ile özelliklerine deger ataması gerçekleştirebiliriz.
     */

    public Car() {
        // Class özelliklerine parametresiz constructor kullanarak tek tek ulaşabileceğimiz gibi
    }

    public Car(String marka, String model, int modelYear) {

        this.marka = marka;
        this.model = model;
        this.modelYear = modelYear;
       /*

        İstemiş oldugumuz özellikleri parametre olarak alan constructor tanımlayıp oluşturacagımız objeler üzerinden deger ataması gerçeleştirebiliriz.
        Burada dikkat edilmesi gereken husus this keyword'dür.Parametre olarak tanımladıgımız variable isimleri eger class özelliklerimiz ile aynı yazıma sahip ise
        javaya bunu ayırtedebilmesi için this anahtar kelimesini kullanırız.Eger parametre isimleri farklı yazıma sahipse buna gerek kalmamaktadır.

        */

    }

    @Override
    public String toString() {
        return  this.marka + '\n' +
                this.model + '\n' +
                this.modelYear;
    }
}
