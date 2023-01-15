package ru.com.profile.entity;

import java.util.Optional;

public interface ProfileRepository {

  Optional<Profile> getProfileById(int id);

}
