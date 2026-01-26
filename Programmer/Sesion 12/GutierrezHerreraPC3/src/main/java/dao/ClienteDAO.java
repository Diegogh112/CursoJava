package dao;

import model.Cliente;
import java.util.List;

public interface ClienteDAO {

    // INSERT (Stored Procedure)
    void insertar(Cliente cliente);

    // UPDATE (Stored Procedure)
    void actualizar(Cliente cliente);

    // DELETE (Stored Procedure)
    void eliminar(int codigo);

    // SELECT por código
    Cliente buscarPorCodigo(int codigo);

    // SELECT por código, nombre o apellido
    List<Cliente> buscar(String criterio);

    // SELECT todos
    List<Cliente> listar();
}
