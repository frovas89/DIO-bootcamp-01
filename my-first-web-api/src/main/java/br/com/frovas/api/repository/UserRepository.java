package br.com.frovas.api.repository;

import br.com.frovas.api.handler.BusinessException;
import br.com.frovas.api.handler.RequiredFieldException;
import br.com.frovas.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user) {

        if(user.getLogin() == null) {
            throw new RequiredFieldException("login");
        }
        if(user.getPassword() == null) {
            throw new RequiredFieldException("password");
        }
        if(user.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório ");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório ");
        }

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("frovas", "password"));
        users.add(new User("craudia", "pass"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("frovas", "password");
    }

    public User findByUserName(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new User("frovas", "password");
    }

}
