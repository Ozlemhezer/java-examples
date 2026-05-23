import java.security.KeyRep;

public class atama {
    public static void main(String[] args) {
//        int three = 3;
//        String four = "4";
//        var type = 1 + 2 + three + four;
//        System.out.println((Object) type.getClass().getName());
        var  uzunlugu_merak_edilen_nesne = new String("Nermin");
        System.out.println(uzunlugu_merak_edilen_nesne.length()); // gerçek uzunluğunu yazdırır.
        System.out.println("3. index'teki karakter ne ? = "+ uzunlugu_merak_edilen_nesne.charAt(3));
        var a = "Beypazarı";
        System.out.println(a.indexOf("za",2)); //Eğer eşleşen değer bulamasaydı -1 dönerdi.
        System.out.println(a.substring(0,2));
        System.out.println(a.substring(a.indexOf("za"),8)); //zar olur çıktı.

    }
}
