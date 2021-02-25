package dimas.tugas.tugas3classandobject;

/*
Nama    : Dimas Tri Mustakim
NIM     : 205150200111049
Kelas   : Pemrograman Berorientasi Objek TIF-D
 */

import java.util.List;

public class Stasiun {
    // variable
    String nama;
    String lokasi;
    Integer kapasitasKereta;
    Integer luas;

    // konstruktor
    Stasiun(String nama, String lokasi, Integer kapasitasKereta, List<Kereta> keretaTersedia, Integer luas){
        this.nama = nama;
        this.lokasi = lokasi;
        this.kapasitasKereta = kapasitasKereta;
        this.luas = luas;
    }

    // method
    String getNama(){ return nama; }

    void showLuas(){
        System.out.println("Stasiun " + nama + " memiliki luas " + luas + " km2");
    }
}
