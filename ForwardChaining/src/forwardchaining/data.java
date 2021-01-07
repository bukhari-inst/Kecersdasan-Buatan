/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forwardchaining;

/**
 *
 * @author Bukhari_Inst
 */
public class data {

    /**
     * @param args the command line arguments
     */
    private int id;
    private String kode;
    private String gejala;

    public data(int pid, String pKode, String pGejala) {
        this.id = pid;
        this.kode = pKode;
        this.gejala = pGejala;
    }

    public int getId() {
        return id;
    }

    public String getKode() {
        return kode;
    }

    public String getGejala() {
        return gejala;
    } 
}
