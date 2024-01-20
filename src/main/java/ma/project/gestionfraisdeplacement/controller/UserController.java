package ma.project.gestionfraisdeplacement.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import ma.project.gestionfraisdeplacement.entites.User;
import ma.project.gestionfraisdeplacement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
@Tag(name="Utilisateur")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public User save(@RequestBody User o) {
        return userService.save(o);
    }

    @PutMapping("/update")
    public User update(@RequestBody User o) {
        return userService.save(o);
    }

    @DeleteMapping("/delete")
    public void delete( @RequestBody User o) {
        userService.delete(o);
    }

    @GetMapping("")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<User> findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/deletById/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        userService.deleteById(id);
    }
}
