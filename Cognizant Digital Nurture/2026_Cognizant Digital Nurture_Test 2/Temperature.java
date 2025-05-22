import java.io.*;
import java.util.*;
class Main {
    public static void main(String [] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        if(temp<0) 
            System.out.println("Freezing weather");
        else if(temp>=0 && temp<10)
            System.out.println("Very cold weather");
        else if(temp>=10 && temp<20)
            System.out.println("Cold weather");
        else if(temp>=20 && temp<30)
            System.out.println("Normal in temperature");
        else if(temp>=30 && temp<40)
            System.out.println("Its hot");
        else if(temp>=40)
            System.out.println("Its very hot");
    }
}