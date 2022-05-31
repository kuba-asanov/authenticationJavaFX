module com.example.authenticationjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.authenticationjavafx to javafx.fxml;
    exports com.example.authenticationjavafx;
}