/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgData;

/**
 *
 * @author schueler
 */
public class Auto {
    
    private String Carname = "";
    private int CarNr = 0;
    private int Ps = 0;
    private String color = "";

    public String getCarname() {
        return Carname;
    }

    public void setCarname(String Carname) {
        this.Carname = Carname;
    }

    public int getCarNr() {
        return CarNr;
    }

    public void setCarNr(int CarNr) {
        this.CarNr = CarNr;
    }

    public int getPs() {
        return Ps;
    }

    public void setPs(int Ps) {
        this.Ps = Ps;
    }

    public Auto(int carNr,String carName,int ps) {
        this.CarNr = carNr;
        this.Carname = carName;
        this.Ps = ps;
    }

    @Override
    public String toString() {
        return "Auto{" + "Carname=" + Carname + ", CarNr=" + CarNr + ", Ps=" + Ps + '}';
    }

    
    
    
}
