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
public class PlatinumMember extends GoldMember {
    private int bonusPulsa;
    
    //ENCAPSULATION
    void setbonusPulsa(int bonusPulsa){
        if (bonusPulsa > 0){
            this.bonusPulsa = bonusPulsa;    
        } else{
            this.bonusPulsa = 0;
        }
    }
    
    public int getPulsa(){
        return this.bonusPulsa;
    }
    
    //METHOD
    int bonusPulsa(){
        int nPulsa = bonusPulsa*nDay;
        return nPulsa;
    }
    
    
}
