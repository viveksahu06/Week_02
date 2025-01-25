package com.oops.practice_problems.ridehailing;

public interface GPS {
  String getCurrentLocation();

  void updateLocation(String newLocation);
}
