import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println("it's even");
        else
            System.out.println("it's odd");
    }
}
