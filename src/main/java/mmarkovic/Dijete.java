/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmarkovic;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Meeeyo
 */
public class Dijete {
    
    private String ime;
    private String prezime;
    private Date datumRodenja;
    private List<Bolest> bolesti;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public List<Bolest> getBolesti() {
        return bolesti;
    }

    public void setBolesti(List<Bolest> bolesti) {
        this.bolesti = bolesti;
    }
    
    
    
    
}