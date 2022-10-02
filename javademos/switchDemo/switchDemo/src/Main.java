public class Main {
    public static void main(String[] args) {
        //switch bloklarıyla dallandırma yapılır

        char grade = 'K';

        switch (grade) {
            //case=durum
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                //programı bitirmek için "break" kullanılır
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            //Bu harflerden başka bir harf girilirse:
            default:
                System.out.println("Geçersiz not girdiniz!");
        }
    }
}