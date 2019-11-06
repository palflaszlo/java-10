/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankoop2.bankiszolgaltatas.kartya;

import bankoop2.bankiszolgaltatas.BankiSzolgaltatas;
import bankoop2.bankiszolgaltatas.szamla.Szamla;
import tulajdonos.Tulajdonos;

/**
 *
 * @author Diak
 */
public abstract class Kartya extends BankiSzolgaltatas{
    private String kartyaSzam;
    private Szamla szamla;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.kartyaSzam = kartyaSzam;
        this.szamla = szamla;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public Szamla getSzamla() {
        return szamla;
    }
    
    public boolean vasarlas(int osszeg) {
        return this.szamla.kiVesz(osszeg);
    }
    
    //public abstract boolean kiVesz(int osszeg);
    
    
}
