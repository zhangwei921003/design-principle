package com.panda.study.design.pattern.template.jdbc.dao;


import com.panda.study.design.pattern.template.jdbc.entity.Member;
import com.panda.study.design.pattern.template.jdbc.framework.JdbcTemplate;
import com.panda.study.design.pattern.template.jdbc.framework.RowMapper;
import java.util.List;
import javax.sql.DataSource;

public class MemberDao extends JdbcTemplate {

  public MemberDao(DataSource dataSource) {
    super(dataSource);
  }

  public List<?> selectAll() {
    String sql = "select * from t_member";
    return super.executeQuery(sql, (RowMapper<Member>) (rs, rowNum) -> {
      Member member = new Member();
      member.setUserName(rs.getString("username"));
      member.setPassword(rs.getString("password"));
      member.setAge(rs.getInt("age"));
      member.setAddr(rs.getString("addr"));
      return member;
    }, null);
  }
}
