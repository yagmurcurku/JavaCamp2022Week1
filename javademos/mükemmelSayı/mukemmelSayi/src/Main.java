public class Main {
    public static void main(String[] args)
    {
        //6: 1,2,3 += 6
        //28: 1,2,4,7,14 += 28

        int sayi = 6;
        int toplam = 0;

        for (int i = 1; i<sayi; i++)
        {
            if (sayi % i == 0)
            {
                toplam = toplam + i;
            }
        }

        if (sayi == toplam)
        {
            System.out.println(sayi + " Mükemmel sayıdır!");
        }
        else
        {
            System.out.println(sayi + " Mükemmel sayı değildir!");
        }
    }
}