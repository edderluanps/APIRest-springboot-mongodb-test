package com.project.apispringtest.resources;

import com.project.apispringtest.domain.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "Maria", "maria@email.com");
        User alex = new User("2", "Alex", "alex@email.com");
        
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
        
    }
    
}
