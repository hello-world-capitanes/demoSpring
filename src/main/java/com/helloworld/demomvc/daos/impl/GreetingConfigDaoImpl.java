package com.helloworld.demomvc.daos.impl;

import java.util.List;
import com.helloworld.demomvc.daos.GreetingConfigDao;
import com.helloworld.demomvc.models.GreetingConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class GreetingConfigDaoImpl implements GreetingConfigDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;   
    
    @Override
    public List<GreetingConfig> getConfig() {
        String sqlQuery = "SELECT greeting, hour_init, hour_end FROM GreetingConfiguration";
        List<GreetingConfig> configRows = jdbcTemplate.query(sqlQuery, (rs, rowNum) -> new GreetingConfig(rs.getString("greeting"), rs.getInt("hour_init"),  rs.getInt("hour_end")));
        return configRows;
    }
}


