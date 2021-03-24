package com.profile.userprofile.controller;


import com.profile.userprofile.entity.Profile;
import com.profile.userprofile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/addProfile")
    public Profile addProfile(@RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }
    @PostMapping("/addProfiles")
    public List<Profile> addProfiles(@RequestBody List<Profile> profiles) {
        return profileService.saveProfiles(profiles);
    }

    @GetMapping("/profiles")
    public List<Profile> findAllProfiles() {
        return profileService.getProfiles();
    }


    @GetMapping("/profileById/{id}")
    public Profile findProfileById(@PathVariable int id) {
        return profileService.getProfileById(id);
    }

    @GetMapping("/profile/{name}")
    public Profile findProfileByName(@PathVariable String name) {
        return profileService.getProfileByName(name);
    }

   /* @PutMapping("/update")
    public Profile updateProfile(@RequestBody Profile profile) {
        return profileService.updateProfile(profile);
    }*/

    @DeleteMapping("/delete/{id}")
    public String deleteProfile(@PathVariable int id) {
        return profileService.deleteProfile(id);
    }
}
