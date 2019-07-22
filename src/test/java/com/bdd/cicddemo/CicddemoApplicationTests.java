package com.bdd.cicddemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = CicddemoApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CicddemoApplicationTests {

	@Test
	public void contextLoads() {
	}


}