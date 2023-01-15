package ru.com.profile.profile;

import org.springframework.stereotype.*;

@Service
public class ProfileServiceMock implements ProfileService {
  @Override
  public Profile getProfile(int personId) {
    // имитируем обращение к БД
    if (personId == 123) {
      return new Profile(
        personId,
        "Иван",
        "Иванов"
      );
    } else {
      throw new ProfileNotFoundException(personId);
    }
  }
}
