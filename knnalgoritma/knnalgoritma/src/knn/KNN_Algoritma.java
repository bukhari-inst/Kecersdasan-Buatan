package knn;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author acer
 */
public class KNN_Algoritma {

    /**
     * @param args the command line arguments
     */
    // public static void main(String[] args) throws IOException {
    public static String ranking = "";

    public String knn(double Sem1, double Sem2, double Sem3, double Sem4, double Sem5, double Sem6, double IPK) throws IOException {

        // TODO code application logic here
        // Data Training 
        DataTraining training = new DataTraining();

        double n1 = Sem1;
        double n2 = Sem2;
        double n3 = Sem3;
        double n4 = Sem4;
        double n5 = Sem5;
        double n6 = Sem6;
        double ns = IPK;

        double hasilED, hasilED_before;

        Map knn = new HashMap<>();
        System.out.println("DATA TESTING");
        System.out.println("Nilai IP Semester 1    : " + n1);
        System.out.println("Nilai IP Semester 2  : " + n2);
        System.out.println("Nilai IP Semester 3   : " + n3);
        System.out.println("Nilai IP Semester 4  : " + n4);
        System.out.println("Nilai IP Semester 5    : " + n5);
        System.out.println("Nilai IP Semester 6  : " + n6);
        System.out.println("Nilai IP Semester 7    : " + ns);

        System.out.println("");
        System.out.println("Hasil Jarak Euclidean");
        System.out.println("Semester 1  " + "Semester 2  " + "Semester 3  " + "Semester 3  " + "Semester 5  " + "Semester 6  " + "IPK  " + "Kelas      " + "    ED");
        for (int a = 1; a < 8; a++) {
            hasilED = jarakEuclidean2(training.Semester1[a], n1, training.Semester2[a], n2, training.Semester3[a], n3, training.Semester4[a], n4, training.Semester5[a], n5, training.Semester6[a], n6, training.nilaiIPK[a], ns);

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
    static double jarakEuclidean(double A1, double A2, double B1, double B2, double C1, double C2, double D1, double D2, double E1, double E2, double F1, double F2) {
        return Math.sqrt(Math.pow(A1 - A2, 2) + Math.pow(B1 - B2, 2) + Math.pow(C1 - C2, 2) + Math.pow(D1 - D2, 2) + Math.pow(E1 - E2, 2) + Math.pow(F1 - F2, 2));
    }
    
    static double jarakEuclidean2(double T1, double T2, double B1, double B2, double LP1, double LP2, double LG1, double LG2, double L1, double L2) {
        return Math.sqrt(Math.pow(T1 - T2, 2) + Math.pow(B1 - B2, 2) + Math.pow(LP1 - LP2, 2) + Math.pow(LG1 - LG2, 2) + Math.pow(L1 - L2, 2));
    }

    private double jarakEuclidean2(double d, double n1, double d0, double n2, double d1, double n3, double d2, double n4, double d3, double n5, double d4, double n6, double d5, double ns) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
