module com.example.viikko6teht1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.viikko6teht1 to javafx.fxml;
    exports com.example.viikko6teht1;
}