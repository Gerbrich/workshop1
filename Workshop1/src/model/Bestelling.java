package model;

/**
 * Klasse om bestellinggegevens in op te slaan.
 */
public class Bestelling extends Gegeven {
    private int klantId; // De klant die de bestelling gedaan heeft
    private int artikelId1;
    private int artikelId2;
    private int artikelId3;
    private String artikelNaam1;
    private String artikelNaam2;
    private String artikelNaam3;
    private int artikelAantal1;
    private int artikelAantal2;
    private int artikelAantal3;
    private double artikelPrijs1;
    private double artikelPrijs2;
    private double artikelPrijs3;
    
    public Bestelling() {
        klantId = 0;
        artikelId1 = 0;
        artikelId2 = 0;
        artikelId3 = 0;
        artikelNaam1 = "";
        artikelNaam2 = "";
        artikelNaam3 = "";
        artikelAantal1 = 0;
        artikelAantal2 = 0;
        artikelAantal3 = 0;
        artikelPrijs1 = 0;
        artikelPrijs2 = 0;
        artikelPrijs3 = 0;
    }
    
    public int getBestellingId() {
        return super.getId();
    }
    
    public void setBestellingId(int id) {
        super.setId(id);
    }

    public int getKlantId() {
        return klantId;
    }

    public void setKlantId(int klantId) {
        this.klantId = klantId;
    }

    public int getArtikelId1() {
        return artikelId1;
    }

    public void setArtikelId1(int artikelId1) {
        this.artikelId1 = artikelId1;
    }

    public int getArtikelId2() {
        return artikelId2;
    }

    public void setArtikelId2(int artikelId2) {
        this.artikelId2 = artikelId2;
    }

    public int getArtikelId3() {
        return artikelId3;
    }

    public void setArtikelId3(int artikelId3) {
        this.artikelId3 = artikelId3;
    }

    public String getArtikelNaam1() {
        return artikelNaam1;
    }

    public void setArtikelNaam1(String artikelNaam1) {
        this.artikelNaam1 = artikelNaam1;
    }

    public String getArtikelNaam2() {
        return artikelNaam2;
    }

    public void setArtikelNaam2(String artikelNaam2) {
        this.artikelNaam2 = artikelNaam2;
    }

    public String getArtikelNaam3() {
        return artikelNaam3;
    }

    public void setArtikelNaam3(String artikelNaam3) {
        this.artikelNaam3 = artikelNaam3;
    }

    public int getArtikelAantal1() {
        return artikelAantal1;
    }

    public void setArtikelAantal1(int artikelAantal1) {
        this.artikelAantal1 = artikelAantal1;
    }

    public int getArtikelAantal2() {
        return artikelAantal2;
    }

    public void setArtikelAantal2(int artikelAantal2) {
        this.artikelAantal2 = artikelAantal2;
    }

    public int getArtikelAantal3() {
        return artikelAantal3;
    }

    public void setArtikelAantal3(int artikelAantal3) {
        this.artikelAantal3 = artikelAantal3;
    }

    public double getArtikelPrijs1() {
        return artikelPrijs1;
    }

    public void setArtikelPrijs1(double artikelPrijs1) {
        this.artikelPrijs1 = artikelPrijs1;
    }

    public double getArtikelPrijs2() {
        return artikelPrijs2;
    }

    public void setArtikelPrijs2(double artikelPrijs2) {
        this.artikelPrijs2 = artikelPrijs2;
    }

    public double getArtikelPrijs3() {
        return artikelPrijs3;
    }

    public void setArtikelPrijs3(double artikelPrijs3) {
        this.artikelPrijs3 = artikelPrijs3;
    }   

}
