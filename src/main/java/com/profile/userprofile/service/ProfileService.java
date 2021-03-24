package com.profile.userprofile.service;


import com.profile.userprofile.entity.Profile;
import com.profile.userprofile.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfileService {

    @Autowired
    private ProfileRepository repository;

    public Profile saveProfile(Profile profile){
       return repository.save(profile);
    }

    public List<Profile> saveProfiles(List<Profile> profile) {
        return repository.saveAll(profile);
    }

    public List<Profile> getProfiles() {
        return repository.findAll();
    }

    public Profile getProfileById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Profile getProfileByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProfile(int id) {
        repository.deleteById(id);
        return "Profile removed !! " + id;
    }

   /* public Profile updateProfile(Profile Profile) {
        Profile existingProfile = repository.findById(Profile.getId()).orElse(null);
        existingProfile.setName(profile.getName());
        existingProfile.setQuantity(profile.getQuantity());
        existingProfile.setPrice(profile.getPrice());
        return repository.save(existingProfile);
    }*/

}
