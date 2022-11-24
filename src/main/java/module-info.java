module hu.petrik.kormoscsanad_javafxrestclientdolgozat {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.kormoscsanad_javafxrestclientdolgozat to javafx.fxml;
    exports hu.petrik.kormoscsanad_javafxrestclientdolgozat;
}