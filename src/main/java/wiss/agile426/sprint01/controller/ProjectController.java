package wiss.agile426.sprint01.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wiss.agile426.sprint01.Sprint01Application;
import wiss.agile426.sprint01.model.Project;
import wiss.agile426.sprint01.repository.ProjectRepository;

import java.util.List;
import java.util.stream.Stream;



@CrossOrigin
@RestController
@RequestMapping(path = "/project")
public class ProjectController {
    Sprint01Application application;

    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping(path = "")
    public @ResponseBody ResponseEntity<String> addProject(@Valid @RequestBody Project project){
        projectRepository.save(project);
        return ResponseEntity.status(200).body("Project was succesfully addet");
    }

    @GetMapping(path = "")
    public @ResponseBody Stream<Project> getAllProjects(){
        List<Project> projectList = projectRepository.findAll();
        return projectList.stream();
    }
}
