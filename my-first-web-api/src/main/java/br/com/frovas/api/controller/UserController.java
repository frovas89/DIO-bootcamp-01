package br.com.frovas.api.controller;

import br.com.frovas.api.model.User;
import br.com.frovas.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return userRepository.findByUserName(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping()
    public void putUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
