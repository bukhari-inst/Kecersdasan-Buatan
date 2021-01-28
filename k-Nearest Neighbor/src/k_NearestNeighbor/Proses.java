/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k_NearestNeighbor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Bukhari_Inst
 */
public class Proses {

    public static String ranking = "";

    public String knn(double ti, double brt, double lprt, double lpg, double lmk) throws IOException {

        // Data Training 
        DataTraining training = new DataTraining();

        //Data Testing
        double tinggi = ti;
        double berat = brt;
        double lPerut = lprt;
        double lpanggul = lpg;
        double lemak = lmk;

        double hasilED;

        Map knn = new HashMap<>();
        System.out.println("DATA TESTING:");
        System.out.println("Tinggi        : " + tinggi + "\n"
                + "Berat         : " + berat + "\n"
                + "Lebar Perut   : " + lPerut + "\n"
                + "Lebar Panggul : " + lpanggul + "\n"
                + "Lemak         : " + lemak + "\n");
        System.out.println("Hasil Jarak Euclidean:");
        System.out.println("Tinggi  " + "Berat  " + "LPerut  " + "LPanggul " +"Lemak  "+"Hasil Jarak Euclidean");
        for (int a = 1; a < 9; a++) {
            hasilED = jarakEuclidean(training.tinggi[a], tinggi, training.berat[a], berat, training.lPerut[a], lPerut, training.lpanggul[a], lpanggul, training.lemak[a], lemak);
            knn.put(hasilED, training.label[a]);
            System.out.println(training.tinggi[a] + "\t" + training.berat[a] + "\t" + training.lPerut[a] +  "\t" + training.lpanggul[a] + "\t" + training.lemak[a] + "\t" + hasilED+ "\n");
        }

        System.out.println("Ranking Euclidean Distance");

        Map knn_hasil = new TreeMap(knn);
        printMap(knn_hasil);

        System.out.println("");
        System.out.println("Hasil Keputusan : " + knn_hasil.values().toArray()[0] + "\n");
        //return (String) knn_hasil.values().toArray()[0];
        return null;
    }

    public static void printMap(Map map) {
        Set s = map.entrySet();
        Iterator it = s.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Double key = (Double) entry.getKey();
            String value = (String) entry.getValue();
            ranking = ranking + "\n " + "Apel: " + i + " nilai: " + key + " => " + value;
            System.out.println(key + " => " + value);
            i++;
        }
        System.out.println("========================");
    }

    // function untuk Jarak Euclidean
    static double jarakEuclidean(double T1, double T2, double B1, double B2, double LP1, double LP2, double LG1, double LG2, double L1, double L2) {
        return Math.sqrt(Math.pow(T1 - T2, 2) + Math.pow(B1 - B2, 2) + Math.pow(LP1 - LP2, 2) + Math.pow(LG1 - LG2, 2) + Math.pow(L1 - L2, 2));
    }
}
