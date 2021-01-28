/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.nearest.neighbor.test;

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
public class KNN_Algoritma {

    /**
     * @param args the command line arguments
     */
    // public static void main(String[] args) throws IOException {
    public static String ranking = "";

    public String knn(int nR, int uN) throws IOException {

        // TODO code application logic here
        // Data Training 
        DataTraining training = new DataTraining();

//        String[] kelas = {"REGULER", "REGULER", "BEASISWA", "REGULER", "BEASISWA", "BEASISWA",
//            "TIDAK LULUS", "TIDAK LULUS", "REGULER", "TIDAK LULUS"};
        //Data Testing
        int NR = nR;
        int UN = uN;

        double hasilED, hasilED_before;

        Map knn = new HashMap<>();
        System.out.println("DATA TESTING");
        System.out.println("NR    : " + NR);
        System.out.println("UN  : " + UN);
        System.out.println("");
        System.out.println("Hasil Jarak Euclidean");
        System.out.println("R   " + "G   " + "B     " + "Kelas      " + "    ED");
        for (int a = 1; a < 3; a++) {
            hasilED = jarakEuclidean(training.NR[a], NR, training.UN[a], UN);
//             System.out.println(NR[a] + "    " + UN[a] + "   " + kelas[a] + "  " + hasilED);

            knn.put(hasilED, training.kelas[a]);
        }

        System.out.println("Ranking Euclidean Distance");

        Map knn_hasil = new TreeMap(knn);
        printMap(knn_hasil);

        System.out.println("");
        System.out.println("Hasil Keputusan : " + knn_hasil.values().toArray()[0]);
        return (String) knn_hasil.values().toArray()[0];
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
        }//while
        System.out.println("========================");
    }//printMap

    // membuat function untuk Jarak Euclidean
    static double jarakEuclidean(int R1, int R2, int G1, int G2) {
        return Math.sqrt(Math.pow(R1 - R2, 2) + Math.pow(G1 - G2, 2));
    }

}
