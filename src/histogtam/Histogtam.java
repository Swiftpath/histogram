/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histogtam;

import java.util.Scanner;
/**
 *
 * @author Dominic
 */
public class Histogtam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("WHAT ARE THE NUMBERS MASON!");
        System.out.println("when your done enter a number more the 100");
        int n, nextt, ix
            
            do {
            Scanner scanner = new Scanner (System.in);
            while (n <=100 ){
            n = scanner.nextInt();
            if (n >= 1 && n<10 ){
                
            }
       }
        
        String[] astr = {" 1-10 |", "11- 20 | ", "21- 30 | ", "31- 40 | ", "41- 50 | ",
            "51- 60 | ", "61- 70 | ", "71- 80 | ", "81- 90 | ", "91-100 | "};
        
        for (ix = 0; ix < n; ix++) {
            nextt = numbers[ix];
            if (nextt < 11) {
                astr [0] += "*";
            } else if (nextt < 21) {
                astr[1] += "*";
            } else if (nextt < 31) {
                astr[2] += "*";
            } else if (nextt < 41) {
                astr[3] += "*";
            } else if (nextt < 51) {
                astr[4] += "*";
            } else if (nextt < 61) {
                astr[5] += "*";
            } else if (nextt < 71) {
                astr[6] += "*";
            } else if (nextt < 81) {
                astr[7] += "*";
            } else if (nextt < 91) {
                astr[8] += "*";
            } else {
                astr[9] += "*";
            }
        }
        for (ix = 0; ix < 10; ix++) {
            System.out.println(astr[ix]);
            }  
        }
