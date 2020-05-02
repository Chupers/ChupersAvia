package com.BSTU.ChupersAvia.config;

import com.BSTU.ChupersAvia.entity.*;
import com.BSTU.ChupersAvia.entity.dataTransferObjects.*;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MappingConfig {
    @Bean
    public DozerBeanMapper dozerBeanMapper(){
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.addMapping(beanMappingBuilder());
        return dozerBeanMapper;
    }
    @Bean
    public BeanMappingBuilder beanMappingBuilder(){
        return new BeanMappingBuilder(){

            @Override
            protected void configure() {
                mapping(FlightHistory.class, FlightHistoryDTO.class)
                        .fields("users.userId","users");
            }
        };
    }
}
