package cn.itcast;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDateApplicationTests {
	@Autowired
	private UserDao dao;

	@Test
	public void contextLoads() {

		List<User> all = dao.findAll();
		for (User user : all) {
			System.out.println(user);
		}
	}

}
