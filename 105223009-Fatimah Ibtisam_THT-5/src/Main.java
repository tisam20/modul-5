import librarysystem.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        
        perpustakaan.tambahBuku(new Buku("To Kill a Mockingbird", "Harper Lee", 1960));
        perpustakaan.tambahBuku(new Buku("Harry Potter and the Sorcere's Stone", "J.K. Rowling", 1997));
        perpustakaan.tambahBuku(new Buku("The Hunger Games", "Suzanne Collins", 2008));
        perpustakaan.tambahBuku(new Buku("The Fault in Our Stars", "John Green", 2012));
        perpustakaan.tambahBuku(new Buku("It Ends with Us", "Colleen Hoover", 2016));
        perpustakaan.tambahBuku(new Buku("A Court of Silver Flames", "Sarah J. Maas", 2021));
        perpustakaan.tambahBuku(new Buku("Happy Place", "Emily Henry", 2023));
        perpustakaan.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpustakaan.tambahBuku(new Buku("Dear Nathan", "Erisca Febriani", 2016));
        perpustakaan.tambahBuku(new Buku("Aroma Karsa", "Dee Lestari", 2022));
        
        perpustakaan.tampilkanBuku();

        System.out.print("\nMasukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ID User: ");
        String idUser = scanner.nextLine();
        User user = new User(nama, idUser);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Tampilkan Buku");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) { 
                perpustakaan.tampilkanBuku();
                System.out.print("Pilih nomor buku yang ingin dipinjam: ");
                int pilihPinjam = scanner.nextInt();
                
                if (pilihPinjam > 0 && pilihPinjam <= perpustakaan.getJumlahBuku()) {
                    user.pinjamBuku(perpustakaan.getBuku(pilihPinjam - 1));
                } else {
                    System.out.println("Nomor buku tidak valid.");
                }

            } else if (pilihan == 2) { 
                perpustakaan.tampilkanBuku();
                System.out.print("Pilih nomor buku yang ingin dikembalikan: ");
                int pilihKembali = scanner.nextInt();

                if (pilihKembali > 0 && pilihKembali <= perpustakaan.getJumlahBuku()) {
                    user.kembalikanBuku(perpustakaan.getBuku(pilihKembali - 1));
                } else {
                    System.out.println("Nomor buku tidak valid.");
                }

            } else if (pilihan == 3) { 
                perpustakaan.tampilkanBuku();

            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
