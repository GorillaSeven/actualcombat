package com.gorillaseven.wechatordersystem;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WechatordersystemApplicationTests {

	@Test
	public void contextLoads() {
		log.info("info..........");
		log.debug("debug..........");
		log.warn("warn..........");
		log.error("error..........");
		log.trace("trace..........");
	}

}
