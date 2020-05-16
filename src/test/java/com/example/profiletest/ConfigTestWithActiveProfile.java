package com.example.profiletest;

import com.example.profiletest.dummy_files.BubbleSortAlgorithm;
import com.example.profiletest.dummy_files.QuickSortAlgorithm;
import com.example.profiletest.dummy_files.SortAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("sg")
public class ConfigTestWithActiveProfile {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    @Test
    public void WithActiveProfileSG_ItShouldBindQuickSortAlgorithm(){
        assertThat(sortAlgorithm).isExactlyInstanceOf(QuickSortAlgorithm.class);
    }
}
