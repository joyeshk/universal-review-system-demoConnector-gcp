package com.jk.universalreview.demoConnector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class Controller {
    @Autowired
    UsersAPI usersAPI;
    @GetMapping("/callUsersListAPI")
    public List<User> callUsersListAPI(){
        return usersAPI.getUserList();
    }


    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleAnyException(Exception ex){
        return ex.getMessage();
    }
}
