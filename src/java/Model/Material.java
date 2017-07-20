/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Diogenes's
 */
public class Material {
    private String idMaterial;
    private String nome;
    private double custoUnitario;
    private TipoUnidade tipoUnidade;

    public String getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(String idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public TipoUnidade getTipounidade() {
        return tipoUnidade;
    }

    public void setTipounidade(TipoUnidade tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }
    
}
