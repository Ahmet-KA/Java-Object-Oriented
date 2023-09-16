package Abstract_Class;

public class Official extends Accounting {

    /*
    Memur class abstract muhasebe class'ı extend edinmek istediğinde muhasebe class'daki abstract
    methodları kendine uyarlamak zorundadır.Buradaki saatlikÜcret ve aylıkCalismaSüresi methodları
    abstract muhasebe class'dan zorunlu olarak override edilmiştir.Bu da bize tüm personelin
    aynı saatlikÜcret ve aylikCalismaSüresine sahip olmadıgı durumlarda maas hesaplayabilmemizi
    sağlamaktadır.override ettiğimiz saatlikÜcret ve aylikCalismaSüresi methodlarımız ile memur
    personeller için sahip oldukları değerleri tanımlayabiliriz.
     */
    @Override
    protected int hourlyWage() {
        return 30;//Memur personel için yeni saatlik ücret tanımlaması
    }

    @Override
    protected int monthlyWorkingHours() {
        return 200;//Memur personel için yeni aylık çalışma süresi tanımlaması
    }

    public static void main(String[] args) {

        Official official = new Official();
        official.hourlyWage = official.hourlyWage();
        official.monthlyWorkingHours = official.monthlyWorkingHours();
        official.salary = official.salary(official.hourlyWage, official.monthlyWorkingHours);
        official.name = "Hakan";
        official.lastName = "KAYA";

        System.out.println("Salary : " + official.salary + "\n" +
                "Name : " + official.name + "\n" +
                "Last Name : " + official.lastName);

        /*
        OUTPUT:
        Salary : 6000
        Name : Hakan
        Last Name : KAYA
         */
    }

}
