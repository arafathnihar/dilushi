/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilushipharmacy;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author testing
 */
public class InvoiceItem {
    String InvoiceID = "InvoiceID";
    String ProductID = "ProductID" ;
    int InItemPackSize = 11;
    int InItemQty = 22;
    int InItemFree = 33;
    int InItemPrice = 44;
    int InItemMargin = 55;
    Date InItemExpiry = new Date(Calendar.getInstance().getTimeInMillis());
    int InItemDisc = 66;
    int InItemSold = 77; 
}