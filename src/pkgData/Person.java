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
public class Person {
    
    private Auto[] AutoArr; 
    private String Name; 
    private int PersonNr;

    public Person(Auto[] AutoArr, String Name, int PersonNr) {
        this.AutoArr = AutoArr;
        this.Name = Name;
        this.PersonNr = PersonNr;
    }

    @Override
    public String toString() {
        return "Person{" + "AutoArr=" + AutoArr + ", Name=" + Name + ", PersonNr=" + PersonNr + '}';
    }
    
    
    

    public Auto[] getAutoArr() {
        return AutoArr;
    }

    public void setAutoArr(Auto[] AutoArr) {
        this.AutoArr = AutoArr;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPersonNr() {
        return PersonNr;
    }

    public void setPersonNr(int PersonNr) {
        this.PersonNr = PersonNr;
    }
    
    
    
}
