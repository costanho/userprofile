package com.profile.userprofile.controller;

import com.profile.userprofile.service.ProfileService;
import com.profile.userprofile.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private ProfileService profileService;

 @GetMapping("hello-profile")
    public String helloController() {
          return "Hello Costa profileApp";
    }




}
