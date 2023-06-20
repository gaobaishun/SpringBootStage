package com.gbs.staging;

import com.gbs.staging.propertiestest.ProTest;
import com.gbs.staging.yamlObject.Dog;
import com.gbs.staging.yamlObject.YamlObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StagingApplicationTests {

	@Autowired
	private YamlObject yamlObject;

	@Autowired
	private ProTest proTest;

	@Test
	void contextLoads() {
		System.out.println(yamlObject.toString());
		System.out.println(proTest);
	}

}
