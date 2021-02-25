package dimas.tugas.tugas3classandobject;

/*
Nama    : Dimas Tri Mustakim
NIM     : 205150200111049
Kelas   : Pemrograman Berorientasi Objek TIF-D
 */

import java.util.ArrayList;
import java.util.List;

public class Kereta {
    // variable
    String namaKereta;
    String masinis;
    String pekerja;
    List<Gerbong> daftarGerbong = new ArrayList<Gerbong>();
    List<Lokomotif> daftarLokomotif = new ArrayList<Lokomotif>();
    List<Penumpang> penumpang = new ArrayList<Penumpang>();
    Stasiun posisi;
    Stasiun tujuan = null;

    // Konstruktor
    Kereta(String namaKereta, String masinis, String pekerja, Stasiun posisi){
        this.namaKereta = namaKereta;
        this.masinis = masinis;
        this.pekerja = pekerja;
        this.posisi = posisi;
    }

    // method
    void start(){
        if (tujuan != null){
            showPenumpang();
            System.out.println("Kereta " + namaKereta + " berjalan");
            System.out.println("Dari Stasiun "+posisi.getNama() + " ke Stasiun " + tujuan.getNama());
            posisi = tujuan;
            tujuan = null;
            System.out.println("Kereta sudah sampai di tujuan");
        }
        else System.out.println("Tujuan belum ditetapkan !");
    }

    void setTujuan(Stasiun tujuan){
        this.tujuan = tujuan;
    }

    void showPenumpang(){
        System.out.println("Penumpang di kereta " + namaKereta + " ada");
        for (Penumpang pn:penumpang){
            System.out.println(pn.nama);
        }
        System.out.println();
    }

    void showDaftarLokomotif(){
        System.out.println("Daftar Lokomotif Kereta " + namaKereta);
        for (Lokomotif lk:daftarLokomotif){
            System.out.println("Lokomotif: " + lk.id);
        }
        System.out.println();
    }

    void showDaftarGerbong(){
        System.out.println("Daftar Gerbong Kereta " + namaKereta);
        for (Gerbong gb:daftarGerbong){
            System.out.println("Gerbong: " + gb.id);
        }
        System.out.println();
    }

    void showPosition() {
        System.out.println("Kereta " + namaKereta + " sedang ada di " + posisi.getNama());
    }
}
