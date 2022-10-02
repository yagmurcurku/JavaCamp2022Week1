public class Main {
    public static void main(String[] args)
    {
        int number1 = 17296;
        int number2 = 18416;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i<number1; i++)
            if (number1 % i == 0)
            {
                toplam1 = toplam1 + i;
            }

        for (int i = 1; i<number2; i++)
            if (number2 % i == 0)
            {
                toplam2 = toplam2 + i;
            }

        if (toplam1==number2)
        {
            if (toplam2==number1)
            {
                System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır!");
            }
        }
        else
        {
            System.out.println(number1 + " ve " + number2 + " arkadaş sayı değillerdir!");
        }
    }
}