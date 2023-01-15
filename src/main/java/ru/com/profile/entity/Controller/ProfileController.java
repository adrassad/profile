package ru.com.profile.entity.Controller;

import org.springframework.web.bind.annotation.*;
import ru.com.profile.entity.Profile;
import ru.com.profile.entity.ProfileService;

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
