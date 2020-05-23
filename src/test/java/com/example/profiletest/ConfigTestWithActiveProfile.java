package com.example.profiletest;

import com.example.profiletest.dummy_files.BubbleSortAlgorithm;
import com.example.profiletest.dummy_files.QuickSortAlgorithm;
import com.example.profiletest.dummy_files.SortAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("sg")
public class ConfigTestWithActiveProfile {

    @Value("${service.title}")
    private String title;

    @Autowired
    private SortAlgorithm sortAlgorithm;

    @Test
    public void WithActiveProfileSG_ItShouldBindQuickSortAlgorithm(){
        assertThat(sortAlgorithm).isExactlyInstanceOf(QuickSortAlgorithm.class);
    }

    @Test
    public void ActiveProfileSG_ItShouldPickSGRelated(){
        assertEquals("singapore", title);
    }
}
