/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

/**
 *
 * @author Lenovo
 */
public class SilverMember{
    private int Diskon;
    private int Harga;
    public int nDay, bonusPoin;
    public int totalHarga;
    
    //ENCAPSULATION
    public void setDiskon(int Diskon){
        if (Diskon > 0){
            this.Diskon = Diskon;    
        } else{
            this.Diskon = 0;
        }
    }
    
    public int getDiskon(){
        return this.Diskon;
    }
    
    public void setHarga(int Harga){
        if (Harga > 0){
            this.Harga = Harga;    
        } else{
            this.Harga = 0;
        }
    }
    
    public int getPoin(){
        return this.Harga;
    }
    
    //METHOD
    int totalPoin(){
        int totalPoin = bonusPoin*nDay;
        return totalPoin;
    }
    
    int totalHarga(){
        int harga = nDay*(Harga*(100-Diskon)/100);
        return harga; 
    }
}
