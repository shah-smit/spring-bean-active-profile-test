package com.example.profiletest;

import com.example.profiletest.dummy_files.BubbleSortAlgorithm;
import com.example.profiletest.dummy_files.SortAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProfiletestApplicationTests {

	//Testing for Default Profile
	@Autowired
	private SortAlgorithm sortAlgorithm;

	@Value("${service.title}")
	private String title;

	@Test
	void contextLoads() {
	}

	@Test
	public void WithDefaultProfile_ItShouldBindBubbleSortAlgorithm() {
		assertThat(sortAlgorithm).isExactlyInstanceOf(BubbleSortAlgorithm.class);
	}

	@Test
	public void WithDefaultProfile_ItShouldPickSGRelated(){
		assertEquals("maintitle", title);
	}
}
