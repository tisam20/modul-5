package librarysystem;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("\n=== Daftar Buku di Perpustakaan ===");
        for (int i = 0; i < koleksiBuku.size(); i++) {
            Buku buku = koleksiBuku.get(i);
            System.out.println((i + 1) + ". " + buku.getJudul() + " - " + buku.getPenulis() +
                    " (" + buku.getTahunTerbit() + ") [" + buku.getStatus() + "]");
        }
    }

    public Buku getBuku(int index) {
        return koleksiBuku.get(index);
    }

    public int getJumlahBuku() {
        return koleksiBuku.size();
    }
}
