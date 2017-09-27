/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemadamochilaag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Util {

    public List<Item> getItens() {
        String arquivo = "C:\\Users\\Jess\\Desktop\\problemaDaMochilaAG\\arquivoTeste.txt";
        BufferedReader br;
        String linha = "";
        List<Item> itens = new ArrayList<Item>();
        try {
            br = new BufferedReader(new FileReader(arquivo));
            
            int j;
            while ((linha = br.readLine()) != null) {
                j=0;
                String[] infoItem = linha.split(";");
                Item i = new Item();
                i.setId(Integer.parseInt(infoItem[j++]));
                i.setNome(infoItem[j++]);
                i.setPeso(Integer.parseInt(infoItem[j++]));
                i.setPreco(Integer.parseInt(infoItem[j++]));
                i.setVolume(Integer.parseInt(infoItem[j++]));
                
                itens.add(i);
            }
           
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itens;
    }
}