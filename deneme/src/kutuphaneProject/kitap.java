/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneProject;

/**
 *
 * @author enesk
 */
public class kitap {
    private String yazarAdi;
    private String sayfaSayisi;
    private int mevcut;
    private int odunc;
    
    public kitap(String yazarAdi,String kitapAdi,String sayfaSayisi,int mevcut,int odunc){
        this.yazarAdi=yazarAdi;
        this.kitapAdi=kitapAdi;
        this.sayfaSayisi=sayfaSayisi;
        this.mevcut=mevcut;
        this.odunc=odunc;
    }
    
    public int getMevcut() {
        return mevcut;
    }

    public void setMevcut(int mevcut) {
        this.mevcut = mevcut;
    }

    public int getOdunc() {
        return odunc;
    }

    public void setOdunc(int odunc) {
        this.odunc = odunc;
    }
    private String kitapAdi;

    public String getYazarAdi() {
        return yazarAdi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getSayfaSayisi() {
        return sayfaSayisi;
    }
    
    
    
    
}
