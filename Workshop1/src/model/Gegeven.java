package model;

/**
 * Parent klasse van alle klassendie bedoeld zijn voor opslag van database gegevens.
 */
public class Gegeven {
    private int id;
    
    public Gegeven() {
        id = 0;
    }
    
    public Gegeven(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
}
