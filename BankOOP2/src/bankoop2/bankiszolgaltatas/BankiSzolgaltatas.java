/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankoop2.bankiszolgaltatas;

import tulajdonos.Tulajdonos;

/**
 *
 * @author Diak
 */
public abstract class BankiSzolgaltatas {

    public BankiSzolgaltatas(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }
    protected Tulajdonos tulajdonos;
    
    
}
