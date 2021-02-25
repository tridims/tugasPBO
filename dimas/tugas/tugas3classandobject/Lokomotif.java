package dimas.tugas.tugas3classandobject;

/*
Nama    : Dimas Tri Mustakim
NIM     : 205150200111049
Kelas   : Pemrograman Berorientasi Objek TIF-D
 */

public class Lokomotif {
    // variable
    String id;
    Integer horsepower;
    Integer fuelMeter;

    // kostruktor
    Lokomotif(String id, Integer horsepower, Integer fuelMeter){
        this.id = id;
        this.horsepower = horsepower;
        this.fuelMeter = fuelMeter;
    }

    // method
    String getId(){ return id; }
    Integer getHorsepower(){ return horsepower;}
}
