package problemadamochilaag;

import java.util.ArrayList;
import java.util.List;

public class Populacao {
    
    private List<Cromossomo> populacao = new ArrayList<>();
    private int pesoPopulacao;
    

    public List<Cromossomo> getPopulacao() {
        return populacao;
    }

    public void setPopulacao(List<Cromossomo> populacao) {
        this.populacao = populacao;
    }

    public int getPesoPopulacao() {
        return pesoPopulacao;
    }

    public void setPesoPopulacao(int pesoPopulacao) {
        this.pesoPopulacao = pesoPopulacao;
    }
    
    
    
    
}
