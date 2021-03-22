/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author user
 */
public class TugasC {
    // membuat metod 
    public void TugasC(){
        //membuat variable dari data array
        int[][] angka = {
            {5,6,1,7},
            {8,1,2,9},
            {5,4,7,1},
            {8,3,7,5},
        };
        System.out.println("Ini Adalah Tugas C :");
        
        //membuat perulangan dari data array
        for (int i = 0; i<4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}
