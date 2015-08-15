/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilushipharmacy;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author testing
 */
public class AddInvoiceItemController implements Initializable {

    @FXML
    private TextField ProductID;
    @FXML
    private TextField InItemPackSize;
    @FXML
    private TextField InItemQty;
    @FXML
    private TextField InItemFree;
    @FXML
    private TextField InItemPrice;
    @FXML
    private TextField InItemMargin;
    @FXML
    private TextField InItemExpiry;
    @FXML
    private TextField InItemDisc;
    
    @FXML
    private void addInItem(ActionEvent event) {
        /*
            #FROM ARAFATH
            just commented the code below to avoid database errors
            cuz out UI is not yet validated :)
        */
        /*
        InvoiceItem inItem = new InvoiceItem();
        inItem.ProductID = ProductID.getText();
        inItem.InItemPackSize = Integer.parseInt(InItemPackSize.getText());
        inItem.InItemQty = Integer.parseInt(InItemQty.getText());
        inItem.InItemFree = Integer.parseInt(InItemFree.getText());
        inItem.InItemPrice = Integer.parseInt(InItemPrice.getText());
        */
        
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
