module com.example.atividadesaula02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atividadesaula02 to javafx.fxml;
    exports com.example.atividadesaula02;
}