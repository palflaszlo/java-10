/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankoop2.bankiszolgaltatas.szamla;

import bankoop2.bankiszolgaltatas.BankiSzolgaltatas;
import bankoop2.bankiszolgaltatas.kartya.Kartya;
import tulajdonos.Tulajdonos;

/**
 *
 * @author Diak
 */
public abstract class Szamla extends BankiSzolgaltatas{

    public Szamla(int egyenleg, Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.egyenleg = egyenleg;
    }
    protected int egyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }
    
    public int getEgyenleg() {
        return egyenleg;
    }
    
    public void beTesz(int osszeg) {
        egyenleg += osszeg;
    }
    
    public abstract boolean kiVesz(int osszeg);
    
    public Kartya ujKartya(String kartyaszam){
        return new Kartya(super.tulajdonos, this, kartyaszam) {}; //ide a zárójel nem kell de úgy meg nem működik
    }
}
