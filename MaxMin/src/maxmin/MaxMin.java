/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;



/**
 *
 * @author Yisus
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Creathor cthor = new Creathor();
     cthor.leer();
     cthor.asignathor();
     cthor.Infinite();
     
     
        System.out.println("**"+cthor.matrizc);
        
        long matriza[][]={   
            {0,64,1000000000,1000000000,9,1000000000,1000000000,1000000000},
            {1000000000,0,25,1000000000,2,1000000000,1000000000,1000000000},
            {1000000000,1000000000,0,7,1000000000,1000000000,1000000000,1000000000},
            {1000000000,1000000000,1000000000,0,1000000000,1000000000,1000000000,7},
            {1000000000,1000000000,1000000000,1000000000,0,1,1000000000,1000000000},
            {1000000000,1,5,1000000000,1000000000,0,1000000000,1000000000},
            {1000000000,1000000000,1000000000,1000000000,1000000000,1000000000,0,1000000000},
            {1000000000,1000000000,1000000000,1000000000,1000000000,1000000000,6,0}
        };
        
        long matrizb[][]={
            {0,1000000000,999,25},
            {1000000000,0,1000000000,1000000000},
            {1000000000,1000000000,0,1000000000},
            {1000000000,1000000000,20,0}   
        };
        
    
       
        
        
        
         AFloyd ruta = new AFloyd();
         System.out.println(ruta.almo(cthor.matriz));
  
         
        
    
       
    }
    
    
      
}

