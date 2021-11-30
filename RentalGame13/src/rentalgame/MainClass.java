/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

public class MainClass{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INPUT
        Jenis j = new Jenis();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member: ");
        j.jenisMember = input.nextLine();
        
        int n = j.srcMember();
        if(n < 0){
            System.out.println("ID member tidak ada dalam data!");
            System.exit(0);}
        
        System.out.println("--------------------------------");
        Peminjaman p = new Peminjaman();
        p.inDate();
        System.out.println("--------------------------------");
        
        //OUTPUT
        
        int x = j.cekMember();
        switch (x){
            case 'a':
                SilverMember silver = new SilverMember();
                
                silver.setDiskon(1);
                silver.setHarga(25000);
                silver.bonusPoin = 1;
                silver.nDay = p.nDay();
                p.outDate();
                
                System.out.println("");
                
                System.out.println("Total Sewa : " + silver.totalHarga());
                System.out.println("Jumlah Poin	: " + silver.totalPoin());
                break;
                
            case 'b':
                GoldMember gold = new GoldMember();
                
                gold.setDiskon(2);
                gold.setHarga(30000);
                gold.bonusPoin = 5;
                gold.setCashback(5000);
                gold.nDay = p.nDay();           
                p.outDate();
                
                System.out.println("");

                System.out.println("Total Sewa : " + gold.totalHarga());
                System.out.println("Jumlah Poin	: " + gold.totalPoin());
                System.out.println("Jumlah Cashback : " + gold.bonusCashback());
                break;
                
            case 'c':
                PlatinumMember platinum = new PlatinumMember();
                
                platinum.setDiskon(3);
                platinum.setHarga(45000);
                platinum.bonusPoin = 10;
                platinum.setCashback(10000);
                platinum.setbonusPulsa(5000);
                platinum.nDay = p.nDay();
                p.nDay();
                
                System.out.println("");
                
                System.out.println("Total Sewa : " + platinum.totalHarga());
                System.out.println("Jumlah Poin	: " + platinum.totalPoin());
                System.out.println("Jumlah Cashback : " + platinum.bonusCashback());
                System.out.println("Bonus Pulsa : " + platinum.bonusPulsa());
                break; 
        }
    }      
     
}
