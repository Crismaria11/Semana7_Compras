package shopping;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.SimpleDateFormat;

public class ShoppingList {

    //atributes
    SimpleStringProperty nombre;
    SimpleDateFormat fecha;
    ObservableList<Items> items = FXCollections.observableArrayList();

    public ShoppingList(String nombre){

    }


}
