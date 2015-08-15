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
 
import javax.sql.DataSource; 
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
 
public class DataBaseSource {
 
    public static DataSource getMySQLDataSource() {
            MysqlDataSource mysqlDS = new MysqlDataSource();
            mysqlDS.setServerName("localhost");
            mysqlDS.setDatabaseName("movedb");
            mysqlDS.setUser("root");
            mysqlDS.setPassword("");
            
         return mysqlDS;
    }

}