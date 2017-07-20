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
public enum TipoItem {
    
    massa("massa"), cobertura("Cobertura"), recheio("Recheio"), decoracao("Decoração"), adicional("Adicional");
    
    private String tipoItem;
    
    private TipoItem(String tipoItem){
        this.tipoItem = tipoItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }
    
}    
