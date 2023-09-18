package Interface;

public class Customers implements Abank, Bbank {

     /*
        İnterface'ler implements keyword kullanılarak inherit edilir.
        Bir class birden fazla interface'si implement edinebilir.
     */

    /*
    Customers class'ı Abank ve Bbank interfacelerini parent edinmiştir ve sahip oldukları tüm
    özelliklerini almak zorundadırlar.
    Bu yüzden Abank ve Bbank interfacelerindeki tüm methodlar override edilmiştir.
    */
    @Override
    public int accountNumberAbank(int accountNoAbank) {
        return accountNoAbank;
    }

    @Override
    public void balanceAbank() {
        System.out.println(250);
    }

    @Override
    public int accountNumberBbank(int accountNoBbank) {
        return accountNoBbank;
    }

    @Override
    public void balanceBbank() {
        System.out.println(150);
    }

    public static void main(String[] args) {

        /*
        Customers class'ımızdan oluşturacagımız objeler ile artık override edilen methodlarımızdaki
        degerlerimize ulaşabiliriz.
         */
        Customers customers2 = new Customers();
        System.out.println("Banka Adı: " + Abank.bankName);// Abank
        System.out.println("Banka Adresi: " + Abank.bankAddress);// İzmir
        System.out.println("Hesap No: " + customers2.accountNumberAbank(123));// 123
        System.out.print("Bakiye: "); customers2.balanceAbank();// 250
        System.out.println("----------------------");
        System.out.println("Banka Adı: " + Bbank.bankName);// Bbank
        System.out.println("Banka Adresi: " + Bbank.bankAddress);// Ankara
        System.out.println("Hesap No: " + customers2.accountNumberBbank(124));// 124
        System.out.print("Bakiye: "); customers2.balanceBbank();// 150

    }
}
