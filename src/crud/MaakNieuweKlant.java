/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author Sander
 */
public class MaakNieuweKlant {

    TextField tfKlantid = new TextField();
    TextField tfVoornaam = new TextField();
    TextField tfAchternaam = new TextField();
    TextField tfTussenvoegsel = new TextField();
    TextField tfEmail = new TextField();
    TextField tfStraatnaam = new TextField();
    TextField tfPostcode = new TextField();
    TextField tfToevoeging = new TextField();
    TextField tfHuisnummer = new TextField();
    TextField tfWoonplaats = new TextField();
    Button btVoegKlantToe = new Button("Voeg klant toe");
    Label lbError;

    String klantid;
    String voornaam;
    String achternaam;
    String tussenvoegsel;
    String email;
    String straatnaam;
    String postcode;
    String toevoeging;
    String huisnummer;
    String woonplaats;

    MaakNieuweKlant() {

        toonFormulier();
    }

    void toonFormulier() {

        lbError = new Label("Sommige gegevens zijn niet goed ingevuld");
        lbError.setVisible(false);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Klant id:"), 0, 0);
        gridPane.add(tfKlantid, 1, 0);

        gridPane.add(new Label("Voornaam:"), 0, 1);
        gridPane.add(tfVoornaam, 1, 1);
        gridPane.add(new Label("Tussenvoegsel:"), 0, 2);
        gridPane.add(tfTussenvoegsel, 1, 2);
        gridPane.add(new Label("Achternaam:"), 0, 3);
        gridPane.add(tfAchternaam, 1, 3);

        gridPane.add(new Label("E-mail:"), 0, 4);
        gridPane.add(tfEmail, 1, 4);
        gridPane.add(new Label("Straatnaam:"), 0, 5);
        gridPane.add(tfStraatnaam, 1, 5);
        gridPane.add(new Label("Huisnummer:"), 0, 6);
        gridPane.add(tfHuisnummer, 1, 6);
        gridPane.add(new Label("Toevoeging:"), 0, 7);
        gridPane.add(tfToevoeging, 1, 7);

        gridPane.add(new Label("Postcode:"), 0, 8);
        gridPane.add(tfPostcode, 1, 8);
        gridPane.add(new Label("Woonplaats:"), 0, 9);
        gridPane.add(tfWoonplaats, 1, 9);
        gridPane.add(btVoegKlantToe, 1, 10);
        gridPane.add(lbError, 1, 11);

        gridPane.setAlignment(Pos.CENTER);
        tfKlantid.setAlignment(Pos.BOTTOM_LEFT);
        tfVoornaam.setAlignment(Pos.BOTTOM_LEFT);

        tfAchternaam.setAlignment(Pos.BOTTOM_LEFT);
        tfTussenvoegsel.setAlignment(Pos.BOTTOM_LEFT);
        tfEmail.setAlignment(Pos.BOTTOM_LEFT);
        tfStraatnaam.setAlignment(Pos.BOTTOM_LEFT);
        tfPostcode.setAlignment(Pos.BOTTOM_LEFT);
        tfToevoeging.setAlignment(Pos.BOTTOM_LEFT);
        tfHuisnummer.setAlignment(Pos.BOTTOM_LEFT);
        tfWoonplaats.setAlignment(Pos.BOTTOM_LEFT);

        btVoegKlantToe.setOnAction(e -> {
            valideerInvoer();
        }
        );

        Scene scene = new Scene(gridPane, 400, 400);
        Stage stage = new Stage();

        stage.setTitle("Voeg klant toe");
        stage.setScene(scene);

        stage.show();

    }

    void valideerInvoer() {

        boolean goedIngevuld = false;
        lbError.setVisible(false);

        // Als invoer fout is, kleurt de text rood
        // Anders (terug) naar zwart
        // Aparte methodes per onderdeel lukt niet
        
        String klantid = tfKlantid.getText();
        if (klantid.matches(".*\\D.*")) {
            tfKlantid.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfKlantid.setStyle("-fx-text-inner-color:black;");
        }
        String voornaam = tfVoornaam.getText();
        if ((voornaam.matches(".*\\d.*")) || (voornaam.length() > 50)) {
            tfVoornaam.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfVoornaam.setStyle("-fx-text-inner-color:black;");
        }
        String tussenvoegsel = tfTussenvoegsel.getText();
        if (tussenvoegsel.matches(".*\\d.*")) {
            tfTussenvoegsel.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfTussenvoegsel.setStyle("-fx-text-inner-color:black;");
        }
        String achternaam = tfAchternaam.getText();
        if ((achternaam.matches(".*\\d.*")) || (achternaam.length() > 51)) {
            tfAchternaam.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfAchternaam.setStyle("-fx-text-inner-color:black;");
        }
        String email = tfEmail.getText();
        EmailValidator emailVal = EmailValidator.getInstance();
        if (emailVal.isValid(email)) {
            tfEmail.setStyle("-fx-text-inner-color:black;");
        } else {
            tfEmail.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        }
        String straatnaam = tfStraatnaam.getText();
        if ((straatnaam.matches(".*\\d.*")) || (straatnaam.length() > 26)) {
            tfStraatnaam.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfStraatnaam.setStyle("-fx-text-inner-color:black;");
        }
        String postcode = tfPostcode.getText();

        if ((postcode.length() != 6) || (postcode.matches("\\D{4}\\[a-zA-Z]"))) {
            tfPostcode.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfPostcode.setStyle("-fx-text-inner-color:black;");
        }
        String toevoeging = tfToevoeging.getText();
        if (((toevoeging.matches(".*\\W.*")) || (toevoeging.length() > 6))) {
            tfToevoeging.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfToevoeging.setStyle("-fx-text-inner-color:black;");
        }
        String huisnummer = tfHuisnummer.getText();
        if (huisnummer.matches(".*\\D.*")) {
            tfHuisnummer.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfHuisnummer.setStyle("-fx-text-inner-color:black;");

        }
        String woonplaats = tfWoonplaats.getText();
        if (((straatnaam.matches(".*\\W.*")) || (woonplaats.matches(".*\\d.*")) || (woonplaats.length() > 26))) {
            tfWoonplaats.setStyle("-fx-text-inner-color:red;");
            goedIngevuld = false;
        } else {
            tfWoonplaats.setStyle("-fx-text-inner-color:black;");

        }

        if (goedIngevuld) {
            voegDataInDatabase();
        } else {
            lbError.setVisible(true);
        }
    }

    void voegDataInDatabase() {

        lbError.setVisible(false);
        try {

            CRUD crud = new CRUD() {

            };

            String SQL = "INSERT INTO KLANT(klant_id,voornaam,tussenvoegsel,"
                    + "achternaam,email,straatnaam,huisnummer,toevoeging,postcode,"
                    + "woonplaats) VALUES(?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pstmt = crud.connection.prepareStatement(SQL);

            crud.connection.setAutoCommit(false);

            pstmt.setString(1, klantid);
            pstmt.setString(2, voornaam);
            pstmt.setString(3, tussenvoegsel);
            pstmt.setString(4, achternaam);
            pstmt.setString(5, email);
            pstmt.setString(6, straatnaam);
            pstmt.setString(7, huisnummer);
            pstmt.setString(8, toevoeging);
            pstmt.setString(9, postcode);
            pstmt.setString(10, woonplaats);

            pstmt.addBatch();

            //Create an int[] to hold returned values
            int[] count = pstmt.executeBatch();

            crud.connection.commit();
            System.out.println("Nieuwe klant gemaakt");

        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());

        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
