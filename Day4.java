package Days4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("masukkan nilai anda = ");
        nilai = input.nextInt();
        if (nilai > 75 ) {
            System.out.println("tuntas");
        }else if (nilai <75 ) {
            System.out.println("tidak tuntas");
        }else {
            System.out.println("error");
        }
    }
    
}
