/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.nearest.neighbor.test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bukhari_Inst
 */
public class KNN_Run {
    public static void main(String[] args) {
        //Data Testing
        int nr= 6;
        int un= 9;

        KNN_Algoritma deteksi = new KNN_Algoritma();
        String hasil = null;
        
        try {
            hasil = deteksi.knn(nr,un);
        } catch (IOException ex) {
            Logger.getLogger(KNN_Run.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
