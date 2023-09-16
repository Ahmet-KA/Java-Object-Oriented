package Abstract_Class;

public abstract class Personel {
    /*
        Kurdugumuz yapıda abstract Personel classımız çatı class olarak da adlandırabileceğimiz ve kendisini
        extend edecek child class'lar için özellikler taşımakta.Burada tüm child'larım için ortak ve
        sabit olan özelliklerimi static ve final olarak tanımlıyorum.Şirket ismi ve şirket adresinin
        tüm personel için ortak ve sabit oldugunu düşünebilirsiniz.
     */
    static final String companyName = "Kaya A.Ş";
    static final String companyAddress = "İstanbul/Turkey";

    protected String name = "Belirtilmedi";
    protected String lastName = "Belirtilmedi";
    protected String tcNo = "Belirtilmedi";
    protected String telephone = "Belirtilmedi";
    protected String dateOfStart = "Belirtilmedi";
    protected String insurance = "Belirtilmedi";
}
