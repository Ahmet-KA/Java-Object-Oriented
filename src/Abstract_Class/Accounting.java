package Abstract_Class;

public abstract class Accounting extends Personel {


    protected int hourlyWage; // Aynı package ve child class'lar tarafından da ulaşılabilmesi için protected access modifiers kullanıyoruz
    protected int monthlyWorkingHours;
    protected int salary;

    /*
    Muhasebe clasımız abstract class olmakla birlikte abstract saatÜcreti ve aylıkCalismaSüresi
    olarak methodlar içermekte.Abstract class'larda abstract methodlar zorunlu olarak
    child class'larda override edilecekleri için method body'sine ihtiyaç yoktur.
     */
    protected abstract int hourlyWage();

    protected abstract int monthlyWorkingHours();

    /*
    Abstract class'larda child class'lar için ortak ve aynı işlemi gerçekleştirecek abstract olmayan
    methodlarda bulunabilir.Burada ki maas hesaplama methodu tüm personel için aynı ve ortak oldugu
    için muhasebe class'ı extend edecek child'larda ortak kullanıma sunulmuştur.
     */
    protected int salary(int hourlyWage, int monthlyWorkingHours) {
        int salary = hourlyWage * monthlyWorkingHours;
        return salary;
    }

}
