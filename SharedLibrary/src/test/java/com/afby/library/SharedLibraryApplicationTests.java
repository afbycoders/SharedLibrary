package com.afby.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.afby.library.config.SharedLibraryApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SharedLibraryApplication.class)
@WebAppConfiguration
public class SharedLibraryApplicationTests {

	@Test
	public void contextLoads() {
	}

}
