package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Class used by queryResult to represent rows. All properties are converted to String properties to
 * support easy display and editing in a TableView. (bestelling properties nog niet!)
 */
public class QueryResultRow extends DataDisplayRow {
    private Klant klant;
    private Bestelling bestelling;
    private SimpleStringProperty klant_idProperty;
    private SimpleStringProperty huisnummerProperty;
    
    public QueryResultRow() {
        klant = new Klant();
        bestelling = new Bestelling();
        klant_idProperty = null;
        huisnummerProperty = null;
    }
    
    public int getKlant_id() {
        return klant.getKlant_id();
    }
    
    public void setKlant_id(int id) {
        klant.setKlant_id(id);
        bestelling.setKlant_id(id);
        klant_idProperty = new SimpleStringProperty(id + "");
    }
    
    @Override
    public StringProperty klant_idProperty() {        
        return klant_idProperty;
    }
    
    public String getVoornaam() {
        return klant.getVoornaam();
    }

    public void setVoornaam(String voornaam) {
        klant.setVoornaam(voornaam);
    }
    
    public StringProperty voornaamProperty() {
        return klant.voornaamProperty();
    }

    public String getTussenvoegsel() {
        return klant.getTussenvoegsel();
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        klant.setTussenvoegsel(tussenvoegsel);
    }
    
    public StringProperty tussenvoegselProperty() {
        return klant.tussenvoegselProperty();
    }

    public String getAchternaam() {
        return klant.getAchternaam();
    }

    public void setAchternaam(String achternaam) {
        klant.setAchternaam(achternaam);
    }
    
    public StringProperty achternaamProperty() {
        return klant.achternaamProperty();
    }

    public String getEmail() {
        return klant.getEmail();
    }

    public void setEmail(String email) {
        klant.setEmail(email);
    }
    
    public StringProperty emailProperty() {
        return klant.emailProperty();
    }

    public String getStraatnaam() {
        return klant.getStraatnaam();
    }

    public void setStraatnaam(String straatnaam) {
        klant.setStraatnaam(straatnaam);
    }
    
    public StringProperty straatnaamProperty() {
        return klant.straatnaamProperty();
    }

    public int getHuisnummer() {
        return klant.getHuisnummer();
    }

    public void setHuisnummer(int huisnummer) {
        klant.setHuisnummer(huisnummer);
        huisnummerProperty = new SimpleStringProperty(huisnummer + "");
    }
    
    public StringProperty huisnummerProperty() {
        return huisnummerProperty;
    }

    public String getToevoeging() {
        return klant.getToevoeging();
    }

    public void setToevoeging(String toevoeging) {
        klant.setToevoeging(toevoeging);
    }
    
    public StringProperty toevoegingProperty() {
        return klant.toevoegingProperty();
    }

    public String getPostcode() {
        return klant.getPostcode();
    }

    public void setPostcode(String postcode) {
        klant.setPostcode(postcode);
    }
    
    public StringProperty postcodeProperty() {
        return klant.postcodeProperty();
    }

    public String getWoonplaats() {
        return klant.getWoonplaats();
    }

    public void setWoonplaats(String woonplaats) {
        klant.setWoonplaats(woonplaats);
    }
    
    public StringProperty woonplaatsProperty() {
        return klant.woonplaatsProperty();
    }
    
    public int getBestelling_id() {
        return bestelling.getBestelling_id();
    }
    
    public void setBestelling_id(int id) {
        bestelling.setBestelling_id(id);
    }
    
    public IntegerProperty bestelling_idProperty() {
        return bestelling.bestelling_idProperty();
    }
    
    public int getArtikel_id1() {
        return bestelling.getArtikel_id1();
    }

    public void setArtikel_id1(int artikel_id1) {
        bestelling.setArtikel_id1(artikel_id1);
    }

    public IntegerProperty artikel_id1Property() {
        return bestelling.artikel_id1Property();
    }
    
    public int getArtikel_id2() {
        return bestelling.getArtikel_id2();
    }

    public void setArtikel_id2(int artikel_id2) {
        bestelling.setArtikel_id2(artikel_id2);
    }

    public int getArtikel_id3() {
        return bestelling.getArtikel_id3();
    }

    public void setArtikel_id3(int artikel_id3) {
        bestelling.setArtikel_id3(artikel_id3);
    }

    public String getArtikel_naam1() {
        return bestelling.getArtikel_naam1();
    }

    public void setArtikel_naam1(String artikel_naam1) {
        bestelling.setArtikel_naam1(artikel_naam1);
    }

    public String getArtikel_naam2() {
        return bestelling.getArtikel_naam2();
    }

    public void setArtikel_naam2(String artikel_naam2) {
        bestelling.setArtikel_naam2(artikel_naam2);
    }

    public String getArtikel_naam3() {
        return bestelling.getArtikel_naam3();
    }

    public void setArtikel_naam3(String artikel_naam3) {
        bestelling.setArtikel_naam3(artikel_naam3);
    }

    public int getArtikel_aantal1() {
        return bestelling.getArtikel_aantal1();
    }

    public void setArtikel_aantal1(int artikel_aantal1) {
        bestelling.setArtikel_aantal1(artikel_aantal1);
    }

    public int getArtikel_aantal2() {
        return bestelling.getArtikel_aantal2();
    }

    public void setArtikel_aantal2(int artikel_aantal2) {
        bestelling.setArtikel_aantal2(artikel_aantal2);
    }

    public int getArtikel_aantal3() {
        return bestelling.getArtikel_aantal3();
    }

    public void setArtikel_aantal3(int artikel_aantal3) {
        bestelling.setArtikel_aantal3(artikel_aantal3);
    }

    public double getArtikel_prijs1() {
        return bestelling.getArtikel_prijs1();
    }

    public void setArtikel_prijs1(double artikel_prijs1) {
        bestelling.setArtikel_prijs1(artikel_prijs1);
    }

    public double getArtikel_prijs2() {
        return bestelling.getArtikel_prijs2();
    }

    public void setArtikel_prijs2(double artikel_prijs2) {
        bestelling.setArtikel_prijs2(artikel_prijs2);
    }

    public double getArtikel_prijs3() {
        return bestelling.getArtikel_prijs3();
    }

    public void setArtikel_prijs3(double artikel_prijs3) {
        bestelling.setArtikel_prijs3(artikel_prijs3);
    }
    
    public Klant getKlant() {
        return klant;
    }
    
    public void setKlant(Klant k) {
        klant = k;
    }
    
    public Bestelling getBestelling() {
        return bestelling;
    }
    
    public void setBestelling(Bestelling b) {
        bestelling = b;
    }
}