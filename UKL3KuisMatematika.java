package account1.UKL2025;

import java.util.Random;
import java.util.Scanner;

public class UKL3KuisMatematika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("===Kuis Matematika(Perkalian,Pembagian,Modulus)===");

        while(true) {
            int a = rand.nextInt(20) + 1; 
            int b = rand.nextInt(20) + 1;
            
            int operator = rand.nextInt(3);
            int jawabanBenar = 0;
            String Operator = "";

            switch (operator) {
                case 0:
                    Operator = "x"; // Perkalian
                    jawabanBenar = a * b;
                    break;
                case 1:
                    Operator = "/"; // Pembagian
                    a = a * b; 
                    jawabanBenar = a / b;
                    break;
                case 2:
                    Operator = "%"; // Modulus
                    a = a * b; 
                    jawabanBenar = a % b;   
                    break;
            }
            System.out.print(a + " " + Operator + " " + b + " = ");
            int jawabanUser = input.nextInt();

           
            if (jawabanUser == jawabanBenar) {
                System.out.println("✔ Jawaban Anda BENAR!");
            } else {
                System.out.println("✘ Salah! Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Ingin lanjut kuis? (Ya/Tidak): ");
            String pilih = input.next();

            if (pilih.equalsIgnoreCase("Tidak")) {
                System.out.println("!!Kuis Selesai.Terima kasih Sudah Mengerjakan!!");
                break;
            }

        }
    
    
}
}
