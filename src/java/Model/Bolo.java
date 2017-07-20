/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Diogenes's
 */
public class Bolo {
    private int idBolo;
    private Formato formato;
    private int qtdFormas; 
    private List<ItemBolo> composicao;
    private Transporte transporte;
    private double custo;
    private double valor;

    public int getIdBolo() {
        return idBolo;
    }

    public void setIdBolo(int idBolo) {
        this.idBolo = idBolo;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getQtdFormas() {
        return qtdFormas;
    }

    public void setQtdFormas(int qtdFormas) {
        this.qtdFormas = qtdFormas;
    }

    public List<ItemBolo> getComposicao() {
        return composicao;
    }

    public void setComposicao(List<ItemBolo> composicao) {
        this.composicao = composicao;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
