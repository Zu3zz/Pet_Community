package com.nowcoder.community;

import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {

	@Test
	void contextLoads() {
		User user = new User();
		System.out.println(user);
	}

}
