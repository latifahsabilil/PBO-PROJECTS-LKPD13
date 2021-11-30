/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Peminjaman {
    private int D1,M1,Y1;
    private int D2,M2,Y2; 
    private int D,M,Y,nDay;
    
    void inDate(){
        Scanner input = new Scanner(System.in);
        
        // PEMINJAMAN
        System.out.print("Masukkan Tanggal Pinjam (1-31) : ");
        D1 = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12) : ");
        M1 = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam (xxxx) : ");
        Y1 = input.nextInt();
        
        System.out.println("--------------------------------");
        
        // PENGEMBALIAN
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        D2 = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)	: ");
        M2 = input.nextInt();
        System.out.print("Masukkan Tahun Kembali (xxxx) : ");
        Y2 = input.nextInt();
    }
    
    public int nDay(){
        LocalDate from = LocalDate.of(Y1, M1, D1);
        LocalDate to = LocalDate.of(Y2, M2, D2);
        Period p = Period.between(from, to);
        
        
        D = p.getDays();
        M = p.getMonths()*30;
        Y = p.getYears()*360;
        
        nDay = D + M + Y;
        return  nDay;
    }
    
    void outDate(){
        System.out.println("Tanggal Pinjam : " + D1 + "-" + M1 + "-" + Y1);
        System.out.println("Tanggal Kembali: " + D2 + "-" + M2 + "-" + Y2);
        System.out.print("Lama Sewa: " + nDay() +" hari ");
    }
}
