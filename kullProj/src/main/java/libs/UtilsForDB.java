package libs;


import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class UtilsForDB {
     Logger log = Logger.getLogger(getClass());
     Database dBMySQL;



    public String getPassForLogin(String login) throws SQLException, IOException, ClassNotFoundException {
        log.info("--- Conect MySQL DB --------");
        dBMySQL = new Database("MySQL_PADB_DB", "MySQL");
        log.info("--- Conected to MySQL --------");
        String tempPass = dBMySQL
                .selectValue(String.format("select passWord from seleniumTable " +
                        "where login = '%s')",login));
        dBMySQL.quit();
        return tempPass;

    }
}
