package wiss.agile426.sprint01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wiss.agile426.sprint01.model.Project;
import wiss.agile426.sprint01.repository.ProjectRepository;

/**
 * @// TODO: 15/12/2022 test with insomnia
 */

@CrossOrigin
@RestController
@RequestMapping("/projects")
public class UserController {

    @Autowired
    private ProjectRepository projectRepository;


    /**
     * This method is used to get a list of all projects
     *
     * @return id, description, date, coach_id
     */
    @GetMapping(path = "/all")
    public Iterable<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    /**
     * This method is used to add a new project
     */
    @GetMapping(path = "/add")
    public @ResponseBody String addNewProject(@RequestParam String description
            , @RequestParam String date, @RequestParam Integer coach_id) {
        Project project = new Project();
        project.setDescription(description);
        project.setDate(date);
        project.setCoach_id(coach_id);
        projectRepository.save(project);
        return "Saved";
    }

    /**
     * todo: add update and delete
     */
}