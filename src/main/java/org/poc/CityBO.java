package org.poc;

import java.io.Serializable;


public class CityBO implements Serializable {

  private String name;
  private String countryCode;
  private Long population;
  private String district;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Long getPopulation() {
    return population;
  }

  public void setPopulation(Long population) {
    this.population = population;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  @Override
  public String toString() {
    return "CityBO{" +
        "name='" + name + '\'' +
        ", countryCode='" + countryCode + '\'' +
        ", population=" + population +
        ", district='" + district + '\'' +
        '}';
  }
}
