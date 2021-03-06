package org.apsio.sere.model;

import java.time.LocalDate;
import java.util.Date;

public class Pizza {

    private String nom;
    private boolean miel;
    private boolean anchois;
    private boolean jambon;
    private boolean magret;
    private String pate;
    private String base;
    private String image;
    private Date date;

    public Pizza() {
        this.date = new Date();
        this.pate = "fine";
        this.base = "tomate";
    }

    public Pizza(String nom, String pate, String base, boolean miel, boolean anchois, boolean jambon, boolean magret) {
        this.date = new Date();
        this.nom = nom;
        this.miel = miel;
        this.anchois = anchois;
        this.jambon = jambon;
        this.magret = magret;
        this.pate = pate;
        this.base = base;
    }

    public Date getDate() {
        return date;
    }

    public int getPrix() {
        int prix = 0;
        if (this.base.equalsIgnoreCase("tomate")) {
            prix += 3;
        }
        if (this.base.equalsIgnoreCase("creme")) {
            prix += 4;
        }
        if (this.miel) {
            prix += 3;
        }
        if (this.anchois) {
            prix += 1;
        }
        if (this.jambon) {
            prix += 2;
        }
        if (this.magret) {
            prix += 4;
        }
        return prix;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isMiel() {
        return this.miel;
    }

    public void setMiel(boolean miel) {
        this.miel = miel;
    }

    public boolean isAnchois() {
        return this.anchois;
    }

    public void setAnchois(boolean anchois) {
        this.anchois = anchois;
    }

    public boolean isJambon() {
        return this.jambon;
    }

    public void setJambon(boolean jambon) {
        this.jambon = jambon;
    }

    public boolean isMagret() {
        return this.magret;
    }

    public void setMagret(boolean magret) {
        this.magret = magret;
    }

    public String getPate() {
        return this.pate;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String toString() {
        return "Pizza [" + (this.nom != null ? String.valueOf(this.nom) + ", " : "") + (this.pate != null ? String.valueOf(this.pate) + ", " : "") + (this.base != null ? String.valueOf(this.base) + ", " : "") + "prix " + this.getPrix() + ", " + "miel=" + this.miel + ", anchois=" + this.anchois + ", jambon=" + this.jambon + ", magret=" + this.magret + "]";
    }

}
