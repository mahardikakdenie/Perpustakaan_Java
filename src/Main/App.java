package Main;

import java.util.Scanner;

import Function.Function;
// import Function.Function.*;

class App {
    public static void main(String[] args) throws Exception {
        Function fun = new Function();
        fun.clearScreen();
        System.out.println("\n================================== ");
        System.out.println("Perpustakaan Java OOP");
        System.out.println("================================== ");
        System.out.println("-- Pilih Status --");
        System.out.println("1.Meminjam ");
        System.out.println("2.Membeli ");
        System.out.print("Pilih [1 / 2 ] :  ");
        try (Scanner input = new Scanner(System.in)) {
            int pil_status = input.nextInt();
            if (pil_status == 1) {
                fun.clearScreen();
                boolean information = false;
                do {
                    information = false;
                    fun.clearScreen();
                    System.out.println("================================== ");
                    System.out.println("Pilih Buku : ");
                    System.out.println("================================== ");
                    System.out.println("1.Kancil Anak Cerdas");
                    System.out.println("2.Kucing Lucu");
                    System.out.print("Pilih Cerita : [ 1 / 2 ] : ");
                    int pil = input.nextInt();
                    if (pil == 1) {
                        fun.clearScreen();
                        System.out.println("--- Pilih ---");
                        System.out.println("1.Pinjam");
                        System.out.println("2.Informasi");
                        System.out.println("Pilih [ 1 / 2 ] : ");
                        int pilih = input.nextInt();
                        if (pilih == 1) {
                            fun.setType("Kancil Anak Cerdas", "Dongeng", "MD - Entertaiment");
                            System.out.println("Ketik 1 Untuk Kembali ");
                            int key = input.nextInt();
                            if (key == 1) {
                                information = true;
                            }
                        } else if (pilih == 2) {
                            fun.setType("Kancil Anak Cerdas", "Dongeng", "MD - Entertaiment");
                            int key = input.nextInt();
                            System.out.println("Type Somenthing");
                            if (key == 1) {
                                information = true;
                            }
                        }

                    } else if (pil == 2) {
                        fun.clearScreen();
                        fun.setType("Kucing", "Dongeng", "MD");
                    } else {
                        System.out.println("Not Found");
                    }
                } while (information == true);
            }
        }

    }

}
