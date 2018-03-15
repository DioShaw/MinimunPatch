/* change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Yisus
 */
public class Creathor {

    public static int sz = 0;

    List<String> tad = new ArrayList<>();

    public long[][] matriz = new long[0][0];

    long matrizc[][];

    public void Infinite() {

        long x;
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {

                x = matriz[i][j];
                System.out.println("Metodo Infinito:" + x);
                if (x == 0 && i != j) {
                 
                    matriz[i][j] = 1000000000;
                       System.out.println("el Nuevo valor es:"+"{"+i+"--"+j+"}"+matriz[i][j]);
                }

            }
        }

    }

    public void GetSize() {

        String camp = tad.get(0);

        StringTokenizer st = new StringTokenizer(camp, ",");
        while (st.hasMoreTokens()) {
            System.out.println("trololo" + st.nextToken());
            sz = sz + 1;

        }
        matriz = new long[sz][sz];
        System.out.println("El tamaño es:" + sz);

    }

    public void asignathor() {
        System.out.println(tad);
        //int x = 0;
        int j = 0;
        String sTexto = "";
        String ff = "";

        for (int i = 0; i < sz; i++) {
            int x = 0;
            sTexto = tad.get(i);
            StringTokenizer st = new StringTokenizer(sTexto, ",");
            while (st.hasMoreTokens()) {
                System.out.println("poseemos problemas" + i);
                String temp = st.nextToken();

                long Lng = Long.parseLong(temp);
                matriz[i][x] = Lng;
                x = x + 1;
            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.print("[ " + matriz[i][k] + " ]");
            }
            System.out.println("");
        }

        System.out.println("[" + matriz[0][0] + "]");
        System.out.println("*--*" + matriz[2][0] + "*--**");

    }

    public void leer() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            int cont = 0;
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:\\Users\\Yisus\\Desktop\\lol.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            System.out.println("Leyendo el contendio del archivo.txt");
            String linea;

            while ((linea = br.readLine()) != null) {

                tad.add(linea);
            }
            GetSize();
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }
}
