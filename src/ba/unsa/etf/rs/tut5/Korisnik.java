package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {

    private SimpleStringProperty ime = new SimpleStringProperty("");
    private SimpleStringProperty prezime= new SimpleStringProperty("");
    private SimpleStringProperty mail= new SimpleStringProperty("");
    private SimpleStringProperty korisnickoIme= new SimpleStringProperty("");
    private SimpleStringProperty lozinka= new SimpleStringProperty("");


    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public SimpleStringProperty mailProperty() {
        return mail;
    }

    public SimpleStringProperty korisnickoImeProperty() {
        return korisnickoIme;
    }

    public SimpleStringProperty lozinkaProperty() {
        return lozinka;
    }

    public String getIme() {
        return ime.get();
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getMail() {
        return mail.get();
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getKorisnickoIme() {
        return korisnickoIme.get();
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme.set(korisnickoIme);
    }

    public String getLozinka() {
        return lozinka.get();
    }

    public void setLozinka(String lozinka) {
        this.lozinka.set(lozinka);
    }

    public Korisnik(){};

    public Korisnik(String ime, String prezime, String mail,
                    String korisnickoIme, String lozinka) {
        this.ime = new SimpleStringProperty(ime);
        this.prezime = new SimpleStringProperty(prezime);
        this.mail = new SimpleStringProperty(mail);
        this.korisnickoIme = new SimpleStringProperty(korisnickoIme);
        this.lozinka = new SimpleStringProperty(lozinka);
    }

    @Override
    public String toString() {
        String str = ime.get() + " " + prezime.get();
        return str;
    }
}
