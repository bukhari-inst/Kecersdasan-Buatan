/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterGlass;

import java.util.Scanner;

/**
 *
 * @author Bukhari_Inst
 */
public class WaterGlass {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0, y = 0, gelasX = 0, gelasY = 0;

        Scanner inputX = new Scanner(System.in);
        System.out.println("Inputkan Ukuran Gelas X, Gelas Y & Nilai X/Air");
        gelasX = inputX.nextInt();
        gelasY = inputX.nextInt();
        x = inputX.nextInt();
        if (x <= gelasX) {
            System.out.println("Isi penuh gelas berkapasitas " + gelasX + " liter");
            gelasX = x;
	    System.out.println("Keadaan Sekarang: \n");
            System.out.println("x= " + x + "\n");
            System.out.println("y= " + y + "\n");
            if (x + y > gelasY && x > 0) {
                System.out.println("Tuangkan sebagian isi gelas berkapasitas " + gelasX + " liter ke gelas\n"
                        + "berkapasitas " + gelasY + "liter hingga gelas berkapasitas" + gelasY + " liter penuh");
                y = gelasY;
                x = gelasX - gelasY;
	        System.out.println("Keadaan Sekarang: \n");
                System.out.println("x= " + x + "\n");
                System.out.println("y= " + y + "\n");

                if (y > 0) {
                    System.out.println("Kosongkan gelas berkapasitas " + gelasY + " liter");
                    y = 0;
	            System.out.println("Keadaan Sekarang: \n");
                    System.out.println("x= " + x + "\n");
                    System.out.println("y= " + y + "\n");

                    if (x + y <= gelasY && x > 0) {
                        System.out.println("Tuangkan seluruh isi gelas berkapasitas " + gelasX + " liter ke gelas\n"
                                + "berkapasitas " + gelasY + " liter");
                        y = x;
                        x -= y;
	                System.out.println("Keadaan Sekarang: \n");
                        System.out.println("x= " + x + "\n");
                        System.out.println("y= " + y + "\n");

                        if (x < gelasX) {
                            System.out.println("Isi penuh gelas berkapasitas " + gelasX + " liter");
                            x = gelasX;
	                    System.out.println("Keadaan Sekarang: \n");
                            System.out.println("x= " + x + "\n");
                            System.out.println("y= " + y + "\n");
                            if (x + y > 3 && x > 0) {
                                System.out.println("Tuangkan sebagian isi gelas berkapasitas " + gelasX + " liter ke gelas\n"
                                        + "berkapasitas " + gelasY + " liter hingga gelas berkapasitas " + gelasY + " liter penuh");
                                x = y + gelasX - gelasY;
                                y = gelasY;
	                        System.out.println("Keadaan Sekarang: \n");
                                System.out.println("x = " + x + "\n");
                                System.out.println("y = " + y + "\n");
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Isian melebihi kapasitas gelas");
        }
    }
}
