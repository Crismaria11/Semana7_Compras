package shopping;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import sun.tools.jconsole.Tab;

import javax.swing.table.TableColumn;
import javax.swing.text.TabableView;
import javax.swing.text.TableView;

public class ShoppingListController {

    @FXML
    Label myList;

    @FXML



    @FXML
    TableView<Items> itemsTable;

    @FXML
    TableColumn itemCol;

    @FXML
    TableColumn quantityCol;

    @FXML
    TableColumn priceCol;

    @FXML
    TableColumn itemsTotalCol;

    @FXML
    TableColumn checkCol;

    @FXML
    public void Initialize(){
        ObservableList<Items> items = FXCollections.observableArrayList();

        itemCol.setCellValueProperty(
            new PropertyValueFactory<Items,String>("name")
        );
        quantityCol.setCellValueProperty(
            new PropertyValueFactory<Items,Integer>("quantity")
        )
}

}
