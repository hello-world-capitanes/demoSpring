package com.helloworld.demomvc.daos;

import java.util.List;
import com.helloworld.demomvc.models.GreetingConfig;

public interface GreetingConfigDao {
    List<GreetingConfig> getConfig();
}
