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
public class HitelSzamla extends Szamla{

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }
    private int hitelKeret;
    
    @Override
    public boolean kiVesz(int osszeg) {
        boolean sikeresPenzfelvetel = false;
        if((super.egyenleg+this.hitelKeret) >= osszeg) {
            super.egyenleg -= osszeg;
            sikeresPenzfelvetel = true;
        }
        return sikeresPenzfelvetel;
    }
}
