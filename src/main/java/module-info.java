module com.example.hello {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.likelion.backend to javafx.fxml;
    exports com.likelion.backend;
}