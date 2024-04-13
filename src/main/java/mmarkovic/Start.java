/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mmarkovic;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Meeeyo
 */
public class Start {

    private List<Dijete> djeca;

    public Start() throws ParseException {
        djeca = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);

        ucitajDjecu();
        ispisIzbivanja();

        Pomocno.ulaz.close();
    }

    public static void main(String[] args) throws ParseException {
        new Start();
    }

    private void ucitajDjecu() {
        do {
            ucitajDijete();
        } while (!Pomocno.ucitajString("Unesi k za prekid unosa djece").equalsIgnoreCase("k"));
    }

    private void ucitajDijete() {
        System.out.println("Unos djeteta");
        Dijete d = new Dijete();
        d.setIme(Pomocno.ucitajString("Unesi ime djeteta"));
        d.setPrezime(Pomocno.ucitajString("Unesi prezime djeteta"));
        d.setDatumRodenja(Pomocno.ucitajDatum("Unesi datum rođenja djeteta"));
        d.setBolesti(ucitajBolesti());
        djeca.add(d);
    }

    private List<Bolest> ucitajBolesti() {
        List<Bolest> bolesti = new ArrayList<>();
        do {
            bolesti.add(ucitajBolest());
        } while (!Pomocno.ucitajString("Unesi k za prekid unosa bolesti").equalsIgnoreCase("k"));
        return bolesti;
    }

    private Bolest ucitajBolest() {
        System.out.println("Unos bolesti");
        Bolest b = new Bolest();
        b.setNaziv(Pomocno.ucitajNazivBolesti("Unesi naziv bolesti"));
        b.setSimptomi(Pomocno.ucitajString("Unesi simptome bolesti"));
        b.setIzbivanje(Pomocno.ucitajInt("Unesi broj dana izbivanja zbog bolesti "));
        return b;
    }

    private void ispisIzbivanja() {
        int suma = 0;
        for (Dijete d : djeca) {
            for (Bolest b : d.getBolesti()) {
                suma += b.getIzbivanje();
                
            }
        }
        System.out.println("Ukupan broj dana izbivanja iz vrtića: " + suma);

    }

}
