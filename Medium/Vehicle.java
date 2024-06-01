package Medium;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */

 /*
 * Nama : Muhammad Raja Fadhil Habibi
 * NIM  : 24060122140131
 * Nama File : Vehicle.java
 * Deskripsi : File class dari Vehicle
 */

 
public abstract class Vehicle {
    public double calcFuelEffiecency;
    public double caclTripDistance;
  
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
