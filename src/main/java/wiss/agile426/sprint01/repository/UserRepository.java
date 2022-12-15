package wiss.agile426.sprint01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wiss.agile426.sprint01.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}