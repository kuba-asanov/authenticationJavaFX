module com.example.authenticationjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.authenticationjavafx to javafx.fxml;
    exports com.example.authenticationjavafx;
}