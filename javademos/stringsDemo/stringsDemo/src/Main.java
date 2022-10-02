import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());

        //4 indeksli eleman 5.elemanı verecektir.
        System.out.println("5.eleman : " + mesaj.charAt(4));

        //mesaj ile istenen str birleştirildi.
        System.out.println(mesaj.concat(" Yaşasın!"));

        //mesaj isimli str kendi yapısını korur.
        System.out.println(mesaj);

        //mesaj "B" ile başlıyor mu? Başlıyorsa true döndürür.
        //java caseSensitive bir dildir. "b"yi false döndürür.
        System.out.println(mesaj.startsWith("b"));

        //mesaj "." ile bitiyor mu? Bitiyorsa true döndürür.
        System.out.println(mesaj.endsWith("."));

        //0'dan 4'e kadar olan elemanlar, 0 indisli elemandan itibaren karakterler dizisine atandı.
        char[] karakterler = new char[5];
        //getChars 4'ü dahil etmeyeceği için srEnd 5 olarak tanımlandı.
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        //a karakterinin hangi indekse sahip olduğunu verir.
        //mesaj'da birden fazla "a" vardır FAKAT ilk bulduğu "a"yı alır ve operasyonu sonlandırır.
        System.out.println(mesaj.indexOf('a'));
        //a yerine bir string'i de arayabilir.
        System.out.println(mesaj.indexOf("av"));
        //a karakterini sağdan aramaya başlar FAKAT indeks numarasını yine baştan sayar.
        System.out.println(mesaj.lastIndexOf('a'));

        //replace=değiştirme
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        //bir metnin içerisinden parça alır
        //indeks değeri 2 olan karakterden itibaren metni parçaladık.
        System.out.println(mesaj.substring(2));
        //2.indeksten 4.indekse kadar alır FAKAT 4'ü dahil etmez.
        System.out.println(mesaj.substring(2,4));

        //"split" bir metni belirli bir karakter veya karakter dizisini dikkate alarak parçalar
        for(String kelime : mesaj.split(" "))
        {
            System.out.println(kelime);
        }

        //metindeki bütün büyük harfleri küçük harfe dönüştürür
        System.out.println(mesaj.toLowerCase());

        //metindeki bütün küçük harfleri büyük harfe dönüştürür
        System.out.println(mesaj.toUpperCase());

        //metnin başındaki ve sonundaki boşluları atar.
        System.out.println(mesaj.trim());
    }
}