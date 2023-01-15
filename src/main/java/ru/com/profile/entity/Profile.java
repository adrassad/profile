package ru.com.profile.entity;

public record Profile(
  int id,
  String firstName,
  String lastName,
  int age
) {
}
