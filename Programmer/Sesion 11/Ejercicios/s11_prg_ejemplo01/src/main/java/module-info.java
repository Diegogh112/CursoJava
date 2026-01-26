module com.cjava.escuelapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.cjava.escuelapp to javafx.fxml;
    exports com.cjava.escuelapp;
    exports com.cjava.escuelapp.controllers;
    opens com.cjava.escuelapp.controllers to javafx.fxml;
}