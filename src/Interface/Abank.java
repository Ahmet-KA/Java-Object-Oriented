package Interface;

public interface Abank {

    /*
    interface'lerde kullanılacak variable'lar public static final olarak tanımlanmalıdır.
    bankAddress'de oldugu gibi tanımlama yapılmasada java bunları bu şekilde kabul eder.
     */
    public static final String bankName="Abank";
    String bankAddress="İzmir";

    /*
    interface'ler tamamen soyut yapılardır.Abstract class'larda oldugu gibi concrete methodlar içermezler
    oluşturulan tüm methodlar abstract olarak geçerlidir ve yine override edilecekleri için
    method body'leri yoktur.
     */
    int accountNumberAbank(int accountNoAbank);
    void balanceAbank();
}
