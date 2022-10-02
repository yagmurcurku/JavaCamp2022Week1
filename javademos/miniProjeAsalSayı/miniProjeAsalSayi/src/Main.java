public class Main {
    public static void main(String[] args)
    {
        int number = 3;

        boolean isPrime = true;

        if (number==1)
        {
            System.out.println("Sayı asal değildir!");
            return;
        }

        if (number<1)
        {
            System.out.println("Geçersiz sayı!");
        }

        for (int i=2; i<number; i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
            }
        }

        if (isPrime)    //Bu ifade aslında "isPrime==true" demektir.
        {
            System.out.println("Sayı asaldır.");
        }
        else            //"isPrime==false" durumu.
        {
            System.out.println("Sayı asal değildir!");
        }
    }
}