package ru.com.profile.profile;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/profiles")
public class ProfileController {

  private final ProfileService profileService;

  public ProfileController(ProfileService profileService) {
    this.profileService = profileService;
  }

  @GetMapping(value = "/{personId:\\d+}")
  public Profile getProfile(@PathVariable int personId) {
    return profileService.getProfile(personId);
  }
}
