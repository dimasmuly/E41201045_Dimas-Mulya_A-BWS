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

class Person {
    // definisi atribut (Membuat Atribut OOP)
   private String fName, stuId, stuStatus;
    
   //deklarasi variable
   public Person(String fName, String stuId, String stuStatus){
       this.fName = fName;
       this.stuId = stuId;
       this.stuStatus = stuStatus;
   }   
   //Membuat fungsi * mengambil data dari variabel
   public String getfName() {
       return fName;
   }
   public String getstuId(){
       return stuId;
   }
   public String getstuStatus(){
       return stuStatus;
   }
}

