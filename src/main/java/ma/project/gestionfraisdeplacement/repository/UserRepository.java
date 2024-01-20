package ma.project.gestionfraisdeplacement.repository;

import ma.project.gestionfraisdeplacement.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {

}
