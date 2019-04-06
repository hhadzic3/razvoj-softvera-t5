package sample;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {

    private SimpleStringProperty ime;
    private SimpleStringProperty prezime;
    private SimpleStringProperty mail;
    private SimpleStringProperty korisnickoIme;
    private SimpleStringProperty lozinka;

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getMail() {
        return mail.get();
    }

    public SimpleStringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getKorisnickoIme() {
        return korisnickoIme.get();
    }

    public SimpleStringProperty korisnickoImeProperty() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme.set(korisnickoIme);
    }

    public String getLozinka() {
        return lozinka.get();
    }

    public SimpleStringProperty lozinkaProperty() {
        return lozinka;
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
        return ime.get() + " " + prezime.get();
    }
}
