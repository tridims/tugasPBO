package dimas.tugas.tugas3classandobject;

/*
Nama    : Dimas Tri Mustakim
NIM     : 205150200111049
Kelas   : Pemrograman Berorientasi Objek TIF-D
 */

public class Penumpang {
    // Variable atau atribut yang dimiliki class penumpang
    String nama;
    Integer nomorTiket;
    Integer umur;

    // class BarangBawaan sebagai komposisi/composition dari kelas Penumpang
    BarangBawaan barang = new BarangBawaan("Tas", 7, 10);

    // konstruktor
    Penumpang(String nama, Integer nomorTiket, Integer umur){
        this.nama = nama;
        this.nomorTiket = nomorTiket;
        this.umur = umur;
    }

    // method
    String getNama(){ return nama; }
    Integer getUmur(){ return umur; }
}
