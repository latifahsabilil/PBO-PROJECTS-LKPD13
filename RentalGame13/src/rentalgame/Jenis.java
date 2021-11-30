/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

import static java.util.Collections.binarySearch;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Jenis {
    String jenisMember;
    ArrayList<String> idMember = new ArrayList<String>();
    
    String[][] data = {
        {"Mr.X","Silver"},
        {"Mr.Y","Gold"},
        {"Mr.Z","Platinum"}
    };
    
    int srcMember(){
        idMember.add("M001");
        idMember.add("M002");
        idMember.add("M003");

        int src = binarySearch(idMember, jenisMember);
        return src;
    }
    
    int cekMember(){
        int n = srcMember();
        String x = data[n][1];
        int pil = 0;
        if (x == "Silver") {
            pil='a';
        } else if (x == "Gold"){
            pil='b';
        } else if (x == "Platinum"){
            pil='c';
        }
        System.out.println("ID Member : " + idMember.get(n));
        System.out.println("Nama Member : " + data[n][0]);
        System.out.println("Jenis Member : " + data[n][1]);
        return pil;
    }
}
