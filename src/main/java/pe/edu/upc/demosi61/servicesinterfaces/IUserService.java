package pe.edu.upc.demosi61.servicesinterfaces;

import pe.edu.upc.demosi61.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);
}
