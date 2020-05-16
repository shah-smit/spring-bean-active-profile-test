package com.example.profiletest;

import com.example.profiletest.dummy_files.BubbleSortAlgorithm;
import com.example.profiletest.dummy_files.SortAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProfiletestApplicationTests {

	//Testing for Default Profile
	@Autowired
	private SortAlgorithm sortAlgorithm;

	@Test
	void contextLoads() {
	}

	@Test
	public void WithDefaultProfile_ItShouldBindBubbleSortAlgorithm() {
		assertThat(sortAlgorithm).isExactlyInstanceOf(BubbleSortAlgorithm.class);
	}
}
