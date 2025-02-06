package org.poc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityDao {

  public List<CityBO> fetchCity() {
    String url = "jdbc:mysql://localhost:3306/world";
    String user = "root";
    String password = "root";

    List<CityBO> cities = new ArrayList<>();

    try {
      Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(QueryConstants.CITY_FETCH_QUERY);

      while (rs.next()) {
        CityBO cityBO = new CityBO();
        cityBO.setName(rs.getString("name"));
        cityBO.setCountryCode(rs.getString("Countrycode"));
        cityBO.setPopulation(rs.getLong("population"));
        cityBO.setDistrict(rs.getString("district"));
        cities.add(cityBO);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cities;
  }
}
