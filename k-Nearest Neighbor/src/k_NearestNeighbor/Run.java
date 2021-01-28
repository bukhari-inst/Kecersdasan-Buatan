/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k_NearestNeighbor;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bukhari_Inst
 */
public class Run {

    public static void main(String[] args) {

        boolean bool = true;
        while (bool) {
            //Data Testing
            double ti = 0; // 173 70 75 90 31
            double tb = 0;
            double lp = 0;
            double lg = 0;
            double lmk = 0;

            Scanner inputX = new Scanner(System.in);
            System.out.println("Input Tinggi:");
            ti = inputX.nextInt();
            System.out.println("Input Tinggi Badan:");
            tb = inputX.nextInt();
            System.out.println("Input Lebar Perut:");
            lp = inputX.nextInt();
            System.out.println("Input Lebar Panggul:");
            lg = inputX.nextInt();
            System.out.println("Input Lemak:");
            lmk = inputX.nextInt();

            Proses deteksi = new Proses();
            String hasil = null;

            try {
                hasil = deteksi.knn(ti, tb, lp, lg, lmk);
            } catch (IOException ex) {
                Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
