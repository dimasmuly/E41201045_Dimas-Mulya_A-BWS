/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;

/**
 *
 * @author DimasTamvan
 */
public class ManagingPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //membuat objek   
     Person p1 = new Person("Lisa Palombo", "123456789", "Active");
     
     //Menampilkan dan mengambil data dari subclass
     System.out.println("Student Name : " + p1.getfName()); 
     
     System.out.println("Student ID : " + p1.getstuId()); 
     
     System.out.println("Student Status : " + p1.getstuStatus()); 
     
     if (p1.getstuStatus().equals("Active")){
         System.out.println(p1.getfName() + " Adalah mahasiswa Aktif");
     }
        
    }
    
}
