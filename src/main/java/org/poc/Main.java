package org.poc;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    CityDao cityDao = new CityDao();
    List<CityBO> cityBOS = cityDao.fetchCity();

    System.out.println(cityBOS);

  }
}