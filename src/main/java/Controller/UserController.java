package Controller;

import Entity.UserLogins;
import Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Component
@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<UserLogins> add(@RequestBody UserLogins userLogins){
        UserLogins user = userService.addUser(userLogins);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<UserLogins>> getAll(){
        List<UserLogins> userLogins = userService.getAllUsers();
        return new ResponseEntity<>(userLogins,HttpStatus.OK);
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<Optional<UserLogins>> getUser(@PathVariable("id") int id){
        Optional<UserLogins> userLogins=userService.getUserById(id);
        return new ResponseEntity<>(userLogins,HttpStatus.OK);
    }
    @PutMapping("/{id}/update")
    public ResponseEntity<UserLogins> update(@PathVariable("id") int id, @RequestBody UserLogins userLogins){
        userService.updateUser(userLogins);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<UserLogins> delete(@PathVariable("id") int id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
