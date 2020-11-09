package com.example.hmacsha256;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

@SpringBootTest
class Hmacsha256ApplicationTests {

	@Test
	void contextLoads() {
		try {
			byte[] hmacSha256 = HMAC.calcHmacSha256("secret123".getBytes("UTF-8"), "hello world".getBytes("UTF-8"));
			System.out.println(String.format("Hex: %032x", new BigInteger(1, hmacSha256)));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
