package dimas.tugas.tugas3classandobject;

/*
Nama    : Dimas Tri Mustakim
NIM     : 205150200111049
Kelas   : Pemrograman Berorientasi Objek TIF-D
 */

public class Main {
    public static void main(String[] args) {

        // BUAT STASIUN
        Stasiun stasiunPertama = new Stasiun("Stasiun FILKOM", "Kota Batu", 20, null, 100);
        Stasiun stasiunKedua = new Stasiun("Stasiun TIF-D", "Kota Malang", 20, null, 500);

        // BUAT KERETA
        Kereta keretaPertama = new Kereta("Thomas", "Dimas", "jaki", stasiunPertama);
        Kereta keretaKedua = new Kereta("James", "tri", "erik", stasiunKedua);

        // BUAT GERBONG & LOKOMOTIF UNTUK KERETA PERTAMA
        // Kereta pertama memiliki 1 lokomotif dan 2 gerbong
        Lokomotif lokomotifKeretaPertama = new Lokomotif("1", 2000, 500);
        Gerbong gerbongKeretaPertama1 = new Gerbong("001", "VVIP", 6, 300, 20);
        Gerbong gerbongKeretaPertama2 = new Gerbong("002", "VIP", 4, 500, 35);
        // masukkan object lokomotif dan gerbong ke object kereta (agregasi)
        keretaPertama.daftarLokomotif.add(lokomotifKeretaPertama);
        keretaPertama.daftarGerbong.add(gerbongKeretaPertama1);
        keretaPertama.daftarGerbong.add(gerbongKeretaPertama2);

        // BUAT GERBONG & LOKOMOTIF UNTUK KERETA KEDUA
        // Kereta kedua memiliki 1 lokomotif dan 1 gerbong
        Lokomotif lokomotifKeretaKedua = new Lokomotif("2", 1000, 300);
        Gerbong gerbongKeretaKedua = new Gerbong("003", "Standard", 5, 500, 40);
        // masukkan object lokomotif dan gerbong ke object kereta (agregasi)
        keretaKedua.daftarLokomotif.add(lokomotifKeretaKedua);
        keretaKedua.daftarGerbong.add(gerbongKeretaKedua);

        // BUAT PENUMPANG
        Penumpang penumpang1 = new Penumpang("Olivia", 1, 21);
        Penumpang penumpang2 = new Penumpang("Teddy", 2, 30);
        Penumpang penumpang3 = new Penumpang("Jacob", 3, 25);
        // masukkan penumpang ke kereta
        keretaPertama.penumpang.add(penumpang1);
        keretaPertama.penumpang.add(penumpang2);
        keretaKedua.penumpang.add(penumpang3);


        // print Lokomotif & gerbong yang dimiliki masing2 kereta
        keretaPertama.showDaftarLokomotif();
        keretaPertama.showDaftarGerbong();

        keretaKedua.showDaftarLokomotif();
        keretaKedua.showDaftarGerbong();

        // jalankan kereta pertama ke stasiun lainnya
        keretaPertama.showPosition();
        keretaPertama.setTujuan(stasiunKedua);
        keretaPertama.start();
        keretaPertama.showPosition();
        System.out.println();

        // jalankan kereta kedua ke stasiun lainnya
        keretaKedua.showPosition();
        keretaKedua.setTujuan(stasiunPertama);
        keretaKedua.start();
        keretaKedua.showPosition();
    }
}
