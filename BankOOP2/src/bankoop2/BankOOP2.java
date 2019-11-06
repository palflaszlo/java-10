/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankoop2;

import bankoop2.bankiszolgaltatas.kartya.Kartya;
import bankoop2.bankiszolgaltatas.szamla.HitelSzamla;
import bankoop2.bankiszolgaltatas.szamla.Szamla;
import tulajdonos.Tulajdonos;

/**
 *
 * @author Diak
 */
public class BankOOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bank khb = new Bank();
        Tulajdonos nyl = new Tulajdonos("Nyírő Levente");
        
        /*Szamla nylsz = new HitelSzamla(nyl, 200000);*/
        Tulajdonos gizi = new Tulajdonos("Nyírőnl Gizella");
        Szamla nylsz = khb.szamlaNyitas(nyl, 200000);
        
        Kartya gizikekartya = nylsz.ujKartya("1111");
        Kartya nylkartya = nylsz.ujKartya("2222");
        
        nylsz.beTesz(20000);
        nylsz.kiVesz(100000);
        System.out.println(nylsz.getEgyenleg());
    }
}
