module com.example.dialogue {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.dialogue to javafx.fxml;
    exports com.example.dialogue;
}