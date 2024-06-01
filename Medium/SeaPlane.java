/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medium;

/**
 *
 * @author muham
 */

 /*
 * Nama : Muhammad Raja Fadhil Habibi
 * NIM  : 24060122140131
 * Nama File : SeaPlane.java
 * Deskripsi : File class dari SeaPlane
 */

 
public class SeaPlane extends Airplane {
    public double maxLoad;
    
    public SeaPlane (double maxLoad){
        super(maxLoad);
    }
    
    @Override
    public double calcFuelEfficiency(){
        return 0;
    }
    
    @Override
    public double calcTripDistance(){
        return 0;
    }
    
    @Override
    public void takeOff(){
        
    }
    
    @Override
    public void land(){
        
    }
    
    @Override
    public void fly(){
        
    }
    
    @Override
    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
