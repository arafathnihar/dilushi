/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author testing
 */
public class InvoiceItem {
    /* 
        #FROM ARAFATH
        Guys im just setting default values to send to data base without errors
    */
    
   public String InvoiceID = "InvoiceID";
   public String ProductID = "ProductID" ;
   public int InItemPackSize = 11;
   public int InItemQty = 22;
   public int InItemFree = 33;
   public int InItemPrice = 44;
   public int InItemMargin = 55;
   public Date InItemExpiry = new Date(Calendar.getInstance().getTimeInMillis());
   public int InItemDisc = 66;
   public int InItemSold = 77;
    
    
}