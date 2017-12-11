import java.util.Scanner;

public class Zadanie14
        /*Zadanie 14. Napisać program rysujący w konsoli „choinkę” złożoną
        ze znaków gwiazdki (*). Użytkownik programu powinien podać liczbę
        całkowitą n, n > 0, określającą wysokość choinki (liczbę wierszy).
        Przykład: dla n = 5 wynik powinien wyglądać następująco:
        *
        ***
        *****
        *******
        **********/

{
    public static void main(String[] args)
    {
        System.out.println(" Podaj jakąś dodatnią liczbę");
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        System.out.println(" Twoja iczba to : " + liczba + " i patrz teraz");
        for ( int i = 1; i< liczba; i++)
        {
            System.out.println(" * ");
            //i++;
        }
    }
}
