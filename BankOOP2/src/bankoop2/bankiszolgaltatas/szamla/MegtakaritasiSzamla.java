/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankoop2.bankiszolgaltatas.szamla;

import tulajdonos.Tulajdonos;

/**
 *
 * @author Diak
 */
public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    public static double alapertelmezettKamat = 0.04;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapertelmezettKamat;
    }
    
    public void kamatJovairas() {
        super.egyenleg += (super.egyenleg*this.kamat);
    }

    @Override
    public boolean kiVesz(int osszeg) {
        
        boolean sikeresPenzFelvetel = false;
        
        if((super.egyenleg) >= osszeg) {
            super.egyenleg -= osszeg;
            sikeresPenzFelvetel = true;
        }
        return sikeresPenzFelvetel;

    }
}
