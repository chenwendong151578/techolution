package com.wendong.service;

import com.wendong.service.component.NumberSeqResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.wendong.service.controller.NumberSeqController;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)

public class ServiceApplicationTests {

	final String BASE_URL = "http://localhost:8080/api/v1/numseq?input=5-1-4-2";

	@Autowired
	private NumberSeqController controllerToTest;


	@Test
	public void testGetResponse() throws Exception{
		try {
			RestTemplate rest = new RestTemplate();
			ResponseEntity<NumberSeqResult> result=rest.getForEntity(BASE_URL,NumberSeqResult.class);
			assertEquals(HttpStatus.OK,result.getStatusCode());
			assertTrue(result.getBody().contains(new int[]{5,1,2,4}));
			assertTrue(result.getBody().contains(new int[]{5,1,4,2}));
			assertTrue(result.getBody().contains(new int[]{1,5,2,4}));
			assertTrue(result.getBody().contains(new int[]{1,5,4,2}));
		} catch (HttpClientErrorException e) {
			fail("fail test");
		}
	}
	@Test
	public void contextLoads() {
	}

}
