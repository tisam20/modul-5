package librarysystem;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;
    private static int jumlahBukuTersedia = 0;

    public static int getJumlahBukuTersedia() {
        return jumlahBukuTersedia;
    }

    public static void setJumlahBukuTersedia(int jumlahBukuTersedia) {
        Buku.jumlahBukuTersedia = jumlahBukuTersedia;
    }

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
        jumlahBukuTersedia++;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isStatusDipinjam() {
        return statusDipinjam;
    }

    public void pinjamBuku() {
        if (!statusDipinjam) {
            statusDipinjam = true;
            System.out.println("Buku '" + judul + "' berhasil dipinjam.");
        } else {
            System.out.println("Buku '" + judul + "' sudah dipinjam.");
        }
    }

    public void kembalikanBuku() {
        if (statusDipinjam) {
            statusDipinjam = false;
            System.out.println("Buku '" + judul + "' berhasil dikembalikan.");
        } else {
            System.out.println("Buku '" + judul + "' sudah tersedia di perpustakaan.");
        }
    }

    public String getStatus() {
        return statusDipinjam ? "Dipinjam" : "Tersedia";
    }
}
