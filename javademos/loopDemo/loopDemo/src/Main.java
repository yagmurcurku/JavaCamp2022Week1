public class Main {
    public static void main(String[] args)
    {
        //"for" döngüsü
        for (int i = 2; i<=10; i+=2)
        {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti!");

        //"while" döngüsü
        int i=2;
        while (i<=10)
        {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti!");

        //"do-while" döngüsü
        //do-while döngüsü şart uymasa dahi 1 kere çalışır!
        int j=1;
        do
        {
            //döngü çalışmasa dahi döngüye bir giriş oldu, yani loglandı.
            if(j>10)
            {
                System.out.println("Loglandı");
            }
            System.out.println(j);
            j += 2;
        } while (j<=10);
        System.out.println("Do-While döngüsü bitti!");
    }
}