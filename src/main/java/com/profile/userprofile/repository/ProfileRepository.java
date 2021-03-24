package com.profile.userprofile.repository;

import com.profile.userprofile.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository  extends JpaRepository<Profile,Integer> {
    Profile findByName(String name);
}
