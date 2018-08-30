package shopping;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Items {
    //Atributos
    SimpleStringProperty name;
    SimpleFloatProperty price;
    SimpleFloatProperty itemsTotal;
    SimpleIntegerProperty quantity;
    SimpleStringProperty check = new SimpleStringProperty("waiting");



    //Constructor
    public Items(String name, Float price, Float itemsTotal, Integer quantity){
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleFloatProperty(price);
        this.itemsTotal = new SimpleFloatProperty(price * quantity);
        this.quantity = new SimpleIntegerProperty(quantity);
    }

    //Chequear el estado, entre esperando y hecho
    public void check(){
        if (this.check.equals("waiting")){
            this.check = new SimpleStringProperty("waiting");
        } else{ this.check = new SimpleStringProperty("done");
        }

    }

    //Metodo toString
    @Override
    public String toString() {
        return "Nombre: " + name +
                "Cantidad: " + quantity +
                "Unitario: " + price +
                "Total: " + itemsTotal +
                "Check: " + check;
    }

}