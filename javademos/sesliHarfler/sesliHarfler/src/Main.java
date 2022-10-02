public class Main {
    public static void main(String[] args)
    {
        char harf = 'i';

        switch (harf)
        {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Kalın sesli bir harftir!");
                break;
                default:

                switch (harf)
                {
                    case 'E':
                    case 'e':
                    case 'İ':
                    case 'i':
                    case 'Ö':
                    case 'ö':
                    case 'Ü':
                    case 'ü':
                        System.out.println("İnce sesli bir harftir!");
                        break;
                        default:
                        System.out.println("Sessiz harftir!");
                }
        }
    }
}