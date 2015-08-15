/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilushipharmacy;
        
/**
 *
 * @author testing
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
public class DataBaseCrud {

    public static void main(String[] args) {
        InvoiceItem inItem = new InvoiceItem();
        addInvoceItem(inItem);
    }
    static DataSource ds = DataBaseSource.getMySQLDataSource();

    private static void addInvoceItem(InvoiceItem inItem) {

        try (Connection con = ds.getConnection()) {
            String query = "INSERT INTO `initem`(`InvoiceID`, `ProductID`, "
                    + "`InItemPackSize`, `InItemQty`, `InItemFree`, "
                    + "`InItemPrice`, `InItemMargin`, `InItemExpiry`, "
                    + "`InItemDisc`, `InItemSold`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStmt = con.prepareStatement(query);
            pStmt.setString(1, inItem.InvoiceID);
            pStmt.setString(2, inItem.ProductID);
            pStmt.setInt(3, inItem.InItemPackSize);
            pStmt.setInt(4, inItem.InItemQty);
            pStmt.setInt(5, inItem.InItemFree);
            pStmt.setInt(6, inItem.InItemPrice);
            pStmt.setInt(7, inItem.InItemMargin);
            pStmt.setDate(8,inItem.InItemExpiry );
            pStmt.setInt(9,inItem.InItemDisc);
            pStmt.setInt(10,inItem.InItemSold);

            int rowsInserted = pStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
