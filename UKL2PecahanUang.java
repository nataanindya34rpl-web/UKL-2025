package account1.UKL2025;

import java.util.Scanner;

public class UKL2PecahanUang {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int [] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
        int [] koin = {500,200,100,50,25};
       
        System.out.println("Masukkan jumlah uang(rupiah);");
        int uang = input.nextInt();
    
        System.out.println("Hasil pecahan uang ");

        for (int p : pecahan ) {
            int lembar = uang / p;
            uang= uang % p;
            if (lembar > 0) {
                System.out.println (lembar +" Lembar Pecahan " + p);
            }
        } 
        for (int p : koin) {
            int jumlahKoin = uang / p;
            uang = uang % p;
            if (jumlahKoin > 0) {
                System.out.println(jumlahKoin + " Koin Pecahan " + p);
            }
        }
         
       
    }
}
