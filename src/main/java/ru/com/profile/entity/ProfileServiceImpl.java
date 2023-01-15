package ru.com.profile.entity;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import ru.com.profile.ProfileNotFoundException;

@Primary
@Service
public class ProfileServiceImpl implements ProfileService {

  private final ProfileRepository profileRepository;

  public ProfileServiceImpl(ProfileRepository profileRepository) {
    this.profileRepository = profileRepository;
  }

  @Override
  public Profile getProfile(int personId) {
    return profileRepository.getProfileById(personId)
      .orElseThrow(() -> new ProfileNotFoundException(personId));
  }
}
