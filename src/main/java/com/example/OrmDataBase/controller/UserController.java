package com.example.OrmDataBase.controller;

import com.example.OrmDataBase.model.entity.User;
import com.example.OrmDataBase.service.lmpl.UserServicelmpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //proyektin restfull app olmasini anlamasi ucun
@RequestMapping("/api/users") //URL ucun
public class UserController {

    private final UserServicelmpl userServicelmpl;

    public UserController(UserServicelmpl userServicelmpl) {
        this.userServicelmpl = userServicelmpl;
    }


    @GetMapping //("/users") hansi url ile muraciet edeceymizi yaziriq
    public List<User> getAll(){
        return userServicelmpl.getAll();
    }

    @GetMapping("/{id}") //id vermey ucun  qeyd edirik
    public User getById(@PathVariable Integer id){ //yuxaridaki id ni metoda oturmek ucun
        return userServicelmpl.getByid(id);
    }

    @PostMapping
    @ResponseStatus (code = HttpStatus.CREATED)//eger saveuser metodu isleyirse response olaraq 201 response gonderecek
    public void saveUser(@RequestBody User user){ //json formatda daxil etdiymiz datani userin anlayacagi formaya ceviri
        userServicelmpl.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userServicelmpl.deleteUser(id);
    }

}

