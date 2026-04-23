/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasarray;

import javax.swing.JOptionPane;
/**
 *
 * @author Hype G12
 */
public class TugasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int nilai[][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}}; 

int total=0;
//variabel untuk menghitung jumlah angka/elemen array 
int putaran=0;
 //looping untuk memunculkan elemen array
int  totalganjil =0;
System.out.println("array = ");
for (int a = 0; a < nilai.length; a++){
    for (int b = 0; b < nilai[a].length; b++){
        System.out.print(nilai[a][b]+" ");
        total += nilai[a][b];
        putaran ++; 
        if (b%2==1){ 
            totalganjil += nilai[a][b];
        }
       }
    System.out.print("\n");
        
    }
System.out.println("Jumlah Keseluruhan adalah\t\t: " + total +"\nRata-Ratanya adalah\t\t\t: " + total / putaran); 
String elemen = JOptionPane.showInputDialog("Masukkan elemen yang ingin diganti\t: "); 
int ganti = Integer.parseInt(elemen); 
putaran=0;
String indeks = "";
for(int i=0;i<nilai.length;i++){
    for(int f=0;f<nilai[i].length;f++){
        if (nilai[i][f]==ganti){
            indeks += "["+i+"]["+f+"]\n";    
putaran++; 
        } 
    }
}
if(putaran>1){JOptionPane.showMessageDialog(null,"Elemen "+ganti+" berada pada indeks:\n"+indeks);
String angka = JOptionPane.showInputDialog("Mau diganti dengan angka berapa?"); 
int baru = Integer.parseInt(angka); 
for (int i = 0; i < nilai.length; i++){
    for (int f = 0; f < nilai[i].length; f++){
        if (nilai[i][f] == ganti){
            nilai[i][f] = baru;
        }
}
}
}
else {JOptionPane.showMessageDialog(null, "Elemen " + ganti + " tidak ditemukan pada Array", "ELEMEN TIDAK DITEMUKAN", JOptionPane.ERROR_MESSAGE); 
}
System.out.println("\nSECOND ARRAY");
for (int i = 0; i < nilai.length; i++){
    for (int f = 0; f < nilai[i].length; f++){
        System.out.print(nilai[i][f] + " ");
    }
    System.out.print("\n");
}
System.out.println("Jumlah indeks ganjil adalah (berdasarkan array original)\t: " + totalganjil); 
}
}
    

