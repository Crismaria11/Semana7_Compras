package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    Label myList;

    public void pressButton (ActionEvent event) {
        ObservableList<String> items = myList.getItems();
        if (Items != null) {
            items.add("no hay articulos");
        } else {
            items = FXCollections.observableArrayList();
            myList.setItems(items);
        }
    }

    @FXML
    TableColumn name;



}
