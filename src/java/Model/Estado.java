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
public enum Estado {
    aguardandoAprovacao("Aguardando aprovação"), naoAceito("Não aceito"), agendado("Agendado"), entregue("Entregue");
    
    private String estado;
    
    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
}
