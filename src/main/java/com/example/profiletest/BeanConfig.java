package com.example.profiletest;

import com.example.profiletest.dummy_files.BubbleSortAlgorithm;
import com.example.profiletest.dummy_files.QuickSortAlgorithm;
import com.example.profiletest.dummy_files.SortAlgorithm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfig {

    @Profile("!sg")
    @Bean
    public SortAlgorithm bubbleSort(){
        return new BubbleSortAlgorithm();
    }

    @Profile("sg")
    @Bean
    public SortAlgorithm quickSort(){
        return new QuickSortAlgorithm();
    }
}
