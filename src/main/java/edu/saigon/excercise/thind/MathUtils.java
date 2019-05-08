package edu.saigon.excercise.thind;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class MathUtils {

  public static int tinhUocChungLonNhat(int a, int b) {
    while (a != b) {
      if (a < b) {
        b = b - a;
      } else {
        a = a - b;
      }
    }
    return a;
  }

  public static  boolean kiemTraSoNguyenTo(int n) {

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
