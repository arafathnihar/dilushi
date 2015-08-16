/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
        
/**
 *
 * @author testing
 */
import business.InvoiceItem;
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

    
    /*
    ALL add Fuctions are below
    */
    static void addInvoceItem(InvoiceItem inItem) {

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
    
    static void addDistri() {

        try (Connection con = ds.getConnection();) {
            String query = "INSERT INTO `distri`(`DistriCode`, `DistriName`, "
                    + "`DistriAdd`, `DistriTel`) VALUES (?,?,?,?)";
            PreparedStatement pStmt = con.prepareStatement(query);
            pStmt.setString(1, "11");
            pStmt.setString(2, "22");
            pStmt.setInt(3, 33);
            pStmt.setInt(4, 44);
            

            int rowsInserted = pStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new distributor was inserted successfully!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    static void addProduct() {

        try (Connection con = ds.getConnection();) {
            String query = "INSERT INTO `product`(`ProductID`, `ProductName` "
                    + "`ProductDiscription`, `ProductBrand`, `ProductStrength`, "
                    + "`ProductStype`, `ProductStock`, `ProductMinStock`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pStmt = con.prepareStatement(query);
            pStmt.setString(1, "11");
            pStmt.setString(2, "22");
            pStmt.setInt(3, 33);
            pStmt.setInt(4, 44);
            pStmt.setInt(5, 55);
            pStmt.setInt(6, 66);
            pStmt.setInt(7, 77);
            pStmt.setDate(8, null);
            

            int rowsInserted = pStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new Product was inserted successfully!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    static void addBill() {

        try (Connection con = ds.getConnection();) {
            String query = "INSERT INTO `bill`(`BillNo`, `BiLLDate` "
                    + "`BiLLNote`, `BiLLAmount`) VALUES (?,?,?,?)";
            PreparedStatement pStmt = con.prepareStatement(query);
            pStmt.setString(1, "11");
            pStmt.setString(2, "22");
            pStmt.setInt(3, 33);
            pStmt.setInt(4, 44);
            

            int rowsInserted = pStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new Bill was inserted successfully!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    static void addBillItem() {

        try (Connection con = ds.getConnection();) {
            String query = "INSERT INTO `billitem`(`BillItemNo`, `BiLLNo` "
                    + "`ProductID`, `Qty`, `UnitPrice`, `Total`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pStmt = con.prepareStatement(query);
            pStmt.setString(1, "11");
            pStmt.setString(2, "22");
            pStmt.setInt(3, 33);
            pStmt.setInt(4, 44);
            pStmt.setInt(5, 55);
            pStmt.setInt(6, 66);

            int rowsInserted = pStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new BillItem was inserted successfully!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    static void AddInvoice() {

        try (Connection con = ds.getConnection();) {
            String query = "INSERT INTO `invoice`(`InvoiceID`, `DistriCode` "
                    + "InvoiceDate`, `InvoiceNote`,"
                    + " `InvoicePayMode`,`InvoicePayment`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pStmt = con.prepareStatement(query);
            pStmt.setString(1, "11");
            pStmt.setString(2, "22");
            pStmt.setInt(3, 33);
            pStmt.setInt(4, 44);
            pStmt.setInt(5, 55);
            pStmt.setInt(6, 66);

            int rowsInserted = pStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new Invoice was inserted successfully!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /*
    Delete fuctions below
    */
    static void DeleteInvoceItem(InvoiceItem inItem) {
    
    }
    
    static void DeleteInvoce(InvoiceItem inItem) {
    
    }

    static void DeleteBill(InvoiceItem inItem) {
    
    }
    
    static void DeleteBillItem(InvoiceItem inItem) {
    
    }
    
    static void DeleteProduct(InvoiceItem inItem) {
    
    }
    static void DeleteDistributer(InvoiceItem inItem) {
    
    }

}
