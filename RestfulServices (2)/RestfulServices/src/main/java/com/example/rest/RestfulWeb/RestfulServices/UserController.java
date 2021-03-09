package com.example.rest.RestfulWeb.RestfulServices;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController
{
    @Autowired
    private UserService service;


    @GetMapping("/user")
    public List<User> findAllUsers()
    {
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public EntityModel<User> findOneUser(@PathVariable int id)
    {
        User user = service.findOne(id);

        EntityModel<User> entityModel = EntityModel.of(user);
        Link link = WebMvcLinkBuilder.linkTo(methodOn(this.getClass()).findAllUsers())
                .withRel("all-Users");
        entityModel.add(link);
        return entityModel;

    }

    @PostMapping("/user")
    public ResponseEntity<Object> createEmployeeUser(@RequestBody User user) {
        User user1 = service.save(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user1.getId()).toUri();

        return ResponseEntity.created(location).build();
    }


    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = service.deleteById(id);
    }


    @PutMapping("/user/{id}")
    public void updateUserDetail(@RequestBody User user,@PathVariable int id){
        service.updateUser(id,user);
    }
}
