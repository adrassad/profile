package ru.com.profile.entity;

import org.springframework.stereotype.Component;


import java.sql.*;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

@Component
public class ProfileMapper implements RowMapper<Profile> {

  @Override
  public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new Profile(
      rs.getInt("id"),
      rs.getString("first_name"),
      rs.getString("last_name"),
      rs.getInt("age")
    );
  }

  @Override
  public int[] getRowsForPaths(TreePath[] path) {
    return new int[0];
  }
}
