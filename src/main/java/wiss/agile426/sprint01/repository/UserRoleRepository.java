package wiss.agile426.sprint01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wiss.agile426.sprint01.model.Project;
import wiss.agile426.sprint01.model.UserRole;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}