package com.bisa.configclient.spring;

import com.bisa.configclient.configuration.CloudConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 8/9/2020
 */
@RestController
public class ExampleController {
    @Autowired
    private CloudConfiguration cloudConfiguration;

    @GetMapping("/properties")
    public String getProperties(){
        return cloudConfiguration.getSample();
    }
}

