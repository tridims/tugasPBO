package dimas.tugas.tugas3classandobject;

/*
Nama    : Dimas Tri Mustakim
NIM     : 205150200111049
Kelas   : Pemrograman Berorientasi Objek TIF-D
 */

public class BarangBawaan {
    // Variable dari kelas Barang Bawaan
    String nama;
    Integer berat;
    Integer volume;

    // konstruktor
    BarangBawaan(String nama, Integer berat, Integer volume){
        this.nama = nama;
        this.berat = berat;
        this.volume = volume;
    }

    // method
    String getNama(){ return nama; }
    Integer getBerat(){ return berat; }
}
