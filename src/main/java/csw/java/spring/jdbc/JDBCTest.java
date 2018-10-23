package csw.java.spring.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JDBCTest {

	private ApplicationContext ctx;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	{
		ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-jdbc.xml");
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		namedParameterJdbcTemplate = (NamedParameterJdbcTemplate) ctx.getBean("namedParameterJdbcTemplate");
	}

	@Test
	public void testNamedParameterJdbcTemplate2() {
		String sql = "INSERT INTO user (name,age,address) VALUES (:name,:age,:address)";
		User user = new User();
		user.setAge(1255);
		user.setAddress("Hz");
		user.setName("csw");
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		namedParameterJdbcTemplate.update(sql, paramSource);
	}

	@Test
	public void testNamedParameterJdbcTemplate() {
		String sql = "INSERT INTO user (name,age,address) VALUES (:name,:age,:address)";
		Map<String, Object> map = new HashMap<>();
		map.put("name", "CMC");
		map.put("age", 551);
		map.put("address", "MNXX");
		namedParameterJdbcTemplate.update(sql, map);
	}

	@Test
	public void testQueryForObject2() {
		String sql = "SELECT count(1) FROM user";
		long count = jdbcTemplate.queryForObject(sql, Long.class);
		System.out.println(count);

	}

	@Test
	public void testQueryForList() {
		String sql = "SELECT name,age,address FROM user WHERE id > ?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
		List<User> users = jdbcTemplate.query(sql, rowMapper, 3);
		System.out.println(users);
	}

	@Test
	public void testBatchUpdate() throws SQLException {
		String sql = "INSERT INTO user (name,age,address) VALUES (?,?,?)";
		List<Object[]> batchArgs = new ArrayList<>();
		batchArgs.add(new Object[] { "CSW", 31, "HZ" });
		batchArgs.add(new Object[] { "CMC", 55, "XC" });
		jdbcTemplate.batchUpdate(sql, batchArgs);
	}

	@Test
	public void testUpdate() throws SQLException {
		String sql = "UPDATE user SET age = ? WHERE id = ?";
		jdbcTemplate.update(sql, 6, 9);
	}

	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}

}
