package librarysystem;

public class User {
    private String nama;
    private String idUser;

    public User(String nama, String idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public void pinjamBuku(Buku buku) {
        buku.pinjamBuku();
    }

    public void kembalikanBuku(Buku buku) {
        buku.kembalikanBuku();
    }

    public void displayUser() {
        System.out.println("Nama: " + nama + ", ID User: " + idUser);
    }
}
