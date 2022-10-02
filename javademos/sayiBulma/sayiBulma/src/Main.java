public class Main {
    public static void main(String[] args)
    {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacakSayi = 8;
        boolean varMi = false;

        for (int sayi : sayilar)
        {
            if (sayi == aranacakSayi)
            {
                varMi=true;
                break;
            }
            else
            {
                varMi=false;
            }
        }

        if (varMi)
        {
           System.out.println(aranacakSayi + " sayısı listede mevcuttur");
        }
        else
        {
            System.out.println(aranacakSayi + " sayısı listede mevcut değildir!");
        }
    }
}