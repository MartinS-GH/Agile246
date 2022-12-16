package wiss.agile426.sprint01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wiss.agile426.sprint01.model.User;
import wiss.agile426.sprint01.repository.ProjectRepository;
import wiss.agile426.sprint01.repository.UserRepository;


/**
 * TODO: Everything xD
 */


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     *
     * @Insomnia: POST http://127.0.0.1:8080/user/signup
     *        {
     * 			"name": "Bob",
     * 			"username": "xXbob69Xx",
     * 		  "email": "bob@bob.ch",
     * 		  "password": "secretbob"
     *    }
     *    @return: "User registered successfully"
     */
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto) {
        User user = new User();
        user.setName(signUpDto.getName());
        user.setUsername(signUpDto.getUsername());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(signUpDto.getPassword());
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
}