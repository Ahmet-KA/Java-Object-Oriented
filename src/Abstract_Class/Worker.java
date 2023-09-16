package Abstract_Class;

public class Worker extends Accounting {

    /*
    İşçi class abstract muhasebe class'ı extend edinmek istediğinde muhasebe class'daki abstract
    methodları kendine uyarlamak zorundadır.Buradaki saatlikÜcret ve aylıkCalismaSüresi methodları
    abstract muhasebe class'dan zorunlu olarak override edilmiştir.Bu da bize tüm personelin
    aynı saatlikÜcret ve aylikCalismaSüresine sahip olmadıgı durumlarda maas hesaplayabilmemizi
    sağlamaktadır.override ettiğimiz saatlikÜcret ve aylikCalismaSüresi methodlarımız ile işçi
    personeller için sahip oldukları değerleri tanımlayabiliriz.
     */
    @Override
    protected int hourlyWage() {
        return 20;//İşçi personel için yeni saatlik ücret tanımlaması
    }

    @Override
    protected int monthlyWorkingHours() {
        return 250;// İşçi personel için yeni aylık çalışma süresi tanımlaması
    }

    @Override
    public String toString() {
        return " Worker(İşçi) " + "\n" +
                " companyName= " + companyName + "\n" +
                " hourlyWage= " + hourlyWage + "\n" +
                " monthlyWorkingHours= " + monthlyWorkingHours + "\n" +
                " salary= " + salary + "\n" +
                " name= " + name + "\n" +
                " lastName= " + lastName + "\n" +
                " tcNo= " + tcNo + '\'' +
                " telephone= " + telephone + "\n" +
                " dateOfStart= " + dateOfStart + "\n" +
                " insurance= " + insurance + "\n";
    }

    public static void main(String[] args) {

        Worker worker = new Worker();// Inheritance ile kurdugumuz yapı ile Worker class'ımızdan oluşturacagımız obje ile tüm özelliklere ulaşabiliriz.
        worker.hourlyWage = worker.hourlyWage();// İşçilerimizin saatlik ücretlerine işçi class'ımızda belirlediğimiz değer atamasını gerçekleştiriyoruz.
        worker.monthlyWorkingHours = worker.monthlyWorkingHours();//İşçilerimizin aylık çalışma süresine yine işçi class'ımızda belirlediğimiz deger atamasını yapıyoruz.
        worker.salary = worker.salary(worker.hourlyWage, worker.monthlyWorkingHours);//Muhasebe class'da ortak kullanım için hazırladıgımız maas hesaplama methodu ile işçi personelin hesaplaması yapılıyor.
        worker.name = "Ahmet";
        worker.lastName = "KAYA";

        System.out.println("Salary : " + worker.salary + "\n" +
                "Name : " + worker.name + "\n" +
                "Last Name : " + worker.lastName);

        /*
        OUTPUT:
        Salary : 5000
        Name : Ahmet
        Last Name : KAYA
         */
    }
}
