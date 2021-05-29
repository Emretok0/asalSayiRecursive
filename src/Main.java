import java.util.Scanner;

public class Main {

    static boolean asal(int a, int b){
        if (a%b==0){
            if (a==b){
                return true;
            } else {
                return false;
            }
        } else {
            return asal(a,b+=1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı: ");
        int a = scan.nextInt();
        if (asal(a,2)){
            System.out.println(a+" sayısı ASAL.");
        } else {
            System.out.println(a+" sayısı ASAL DEĞİL.");
        }
    }
}

