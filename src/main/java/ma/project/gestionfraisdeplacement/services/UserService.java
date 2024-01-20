package ma.project.gestionfraisdeplacement.services;

import lombok.AllArgsConstructor;
import ma.project.gestionfraisdeplacement.entites.User;
import ma.project.gestionfraisdeplacement.iservices.IMetier;
import ma.project.gestionfraisdeplacement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IMetier<User> {

    private UserRepository userRepository;

    @Override
    public User save(User o) {
        return userRepository.save(o);
    }

    @Override
    public User update(User o) {
        return userRepository.save(o);
    }

    @Override
    public void delete(User o) {
        userRepository.delete(o);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long aLong) {
        return userRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
