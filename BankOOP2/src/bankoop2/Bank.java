/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankoop2;

import bankoop2.bankiszolgaltatas.szamla.HitelSzamla;
import bankoop2.bankiszolgaltatas.szamla.MegtakaritasiSzamla;
import bankoop2.bankiszolgaltatas.szamla.Szamla;
import java.util.LinkedList;
import java.util.List;
import tulajdonos.Tulajdonos;

/**
 *
 * @author Diak
 */
public class Bank {
    private List<Szamla> bankSzamlak;
    public Bank() {
        this.bankSzamlak = new LinkedList<>();
    }
    
    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla szamla;
        if(hitelKeret > 0){
            szamla = new HitelSzamla(tulajdonos, hitelKeret);
        }
        else{
            szamla = new MegtakaritasiSzamla(tulajdonos);
        }
        this.bankSzamlak.add(szamla);
        return szamla;
    }
    
    public long Osszegyenleg(){
        long s = 0;
        for(Szamla sz : bankSzamlak){
            s+= sz.getEgyenleg();
        }
        return s;
    }
}
