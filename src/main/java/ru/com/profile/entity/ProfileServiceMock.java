package ru.com.profile.entity;

import org.springframework.stereotype.*;
import ru.com.profile.ProfileNotFoundException;

@Service
public class ProfileServiceMock implements ProfileService {
  @Override
  public Profile getProfile(int personId) {
    // имитируем обращение к БД
    if (personId == 123) {
      return new Profile(
        personId,
        "Иван",
        "Иванов",
        5
      );
    } else {
      throw new ProfileNotFoundException(personId);
    }
  }
}
