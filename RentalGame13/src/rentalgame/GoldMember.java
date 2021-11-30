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
public class GoldMember extends SilverMember{
    private int bonusCashback;
    
    //ENCAPSULATION
    void setCashback(int bonusCashback){
        if (bonusCashback > 0){
            this.bonusCashback = bonusCashback;    
        } else{
            this.bonusCashback = 0;
        }
    }
    
    public int getCashback(){
        return this.bonusCashback;
    }
   
    //METHOD
    int bonusCashback(){
        int nCashback = bonusCashback*nDay;
        return nCashback;
    }
}
