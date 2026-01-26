package factory;

import dao.ClienteDAO;
import dao.impl.ClienteDAOImpl;

public class DAOFactory {

    private DAOFactory() {
        // Evita instancias
    }

    public static ClienteDAO getClienteDAO() {
        return new ClienteDAOImpl();
    }
}
