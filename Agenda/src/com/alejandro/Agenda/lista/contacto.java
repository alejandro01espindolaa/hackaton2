package com.alejandro.Agenda.lista;

public class contacto {

    public String name;
    public String lastn1;
    public String lastn3;
    public String phn;
    public String usID;

    public contacto(String name, String lastn1, String lastn3, String phn, String usID) {
        this.name = name;
        this.lastn1 = lastn1;
        this.lastn3 = lastn3;
        this.phn = phn;
        this.usID = usID;
    }

    public String getName() {
        return name;
    }

    public contacto setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastn1() {
        return lastn1;
    }

    public contacto setLastn1(String lastn1) {
        this.lastn1 = lastn1;
        return this;
    }

    public String getLastn3() {
        return lastn3;
    }

    public contacto setLastn3(String lastn3) {
        this.lastn3 = lastn3;
        return this;
    }

    public String getPhn() {
        return phn;
    }

    public contacto setPhn(String phn) {
        this.phn = phn;
        return this;
    }

    public String getUsID() {
        return usID;
    }

    public contacto setUsID(String usID) {
        this.usID = usID;
        return this;
    }
}
