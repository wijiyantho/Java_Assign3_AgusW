package Assignment3;

import java.util.Scanner;

public class kalkulatorRunner {
    public static void main(String[] args) {
        Scanner nilaiInput = new Scanner(System.in);
        System.out.println("--------KALKULATOR SEDERHANA--------");
        System.out.print("Masukkan angka pertama : ");
        int nil1 = nilaiInput.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int nil2 = nilaiInput.nextInt();
        System.out.println("Pilih Angka Operator");
        System.out.println("1)Penjumlahan");
        System.out.println("2)Pengurangan");
        System.out.println("3)Perkalian");
        System.out.println("4)Pembagian");
        System.out.println("5)Modulus");
        System.out.print("Pilihan Operator -> ");
        int oprtr = nilaiInput.nextInt();
        System.out.println("------------------------------------");

        // Calling ClassCalc
        ClassCalc calc = new ClassCalc();
        calc.setNilai1(nil1);
        calc.setNilai2(nil2);
        calc.setOperator(oprtr);

        if (calc.getOperator() == 1) {
            int hasil = calc.getNilai1() + calc.getNilai2();
            System.out.printf("Hasil %d + %d adalah %d", calc.getNilai1(), calc.getNilai2(), hasil);
        }
        else if (calc.getOperator() == 2) {
            int hasil = calc.getNilai1() - calc.getNilai2();
            System.out.printf("Hasil %d - %d adalah %d", calc.getNilai1(), calc.getNilai2(), hasil);
        }
        else if (calc.getOperator() == 3) {
            int hasil = calc.getNilai1() * calc.getNilai2();
            System.out.printf("Hasil %d x %d adalah %d", calc.getNilai1(), calc.getNilai2(), hasil);
        }
        else if (calc.getOperator() == 4) {
            try{
                int hasil = calc.getNilai1() / calc.getNilai2();
                System.out.printf("Hasil %d : %d adalah %d", calc.getNilai1(), calc.getNilai2(), Math.abs(hasil));
            }catch (Exception e){
                System.out.println("Operasi pembagian tidak bisa dilakukan");
            }
        }
        else if (calc.getOperator() == 5) {
            try{
                int hasil = calc.getNilai1() % calc.getNilai2();
                System.out.printf("Hasil %d Mod %d adalah %d", calc.getNilai1(), calc.getNilai2(), hasil);
            }catch (Exception e){
                System.out.println("Operasi modulo tidak bisa dilakukan");
            }
        }
        else {
            System.out.println("Tidak ada operator yang dipilih");
        }
    }
}