public class Mahasiswa<T> {
    private String nama;
    private T nim;

    public Mahasiswa(String namaBaru, T nimBaru) {
        nama = namaBaru;
        nim = nimBaru;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class Concatenation {
    public <A, B, C> void add(A a, B b, C c) {
        System.out.println(a.toString() + " " + b.toString() + " " + c.toString());
    }

    public <A, B> void add(A a, B b) {
        System.out.println(a.toString() + " " + b.toString());
    }
}

public class Aplikasi {
    public static void main(String[] args) {
        Mahasiswa<Integer> mahasiswaInt = new Mahasiswa<>("Budi", 12345);
        Mahasiswa<String> mahasiswaStr = new Mahasiswa<>("Budi", "12345");
        Mahasiswa<Double> mahasiswaDbl = new Mahasiswa<>("Budi", 12345.0);

        mahasiswaInt.tampilkanInfo();
        mahasiswaStr.tampilkanInfo();
        mahasiswaDbl.tampilkanInfo();

        Concatenation concatenation = new Concatenation();
        concatenation.add(1, "Budi");
        concatenation.add(1, "Budi", "12345");
    }
}
