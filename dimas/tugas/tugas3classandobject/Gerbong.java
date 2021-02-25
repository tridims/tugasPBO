package dimas.tugas.tugas3classandobject;

/*
Nama    : Dimas Tri Mustakim
NIM     : 205150200111049
Kelas   : Pemrograman Berorientasi Objek TIF-D
 */

public class Gerbong {
    // variable
    String id;
    String model;
    Integer panjang;
    Integer berat;
    Integer kapasitas;

    // konstruktor
    Gerbong(String id, String model, Integer panjang, Integer berat, Integer kapasitas){
        this.id = id;
        this.model = model;
        this.panjang = panjang;
        this.berat = berat;
        this.kapasitas = kapasitas;
    }

    // method
    String getId(){
        return id;
    }

    Integer getCapacity(){
        return kapasitas;
    }
}
