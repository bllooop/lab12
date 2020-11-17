package lab12;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        EmailTest et = new EmailTest();
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();;
        if (et.isValid(email))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
