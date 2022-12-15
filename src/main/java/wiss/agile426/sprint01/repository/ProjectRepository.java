package wiss.agile426.sprint01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wiss.agile426.sprint01.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}