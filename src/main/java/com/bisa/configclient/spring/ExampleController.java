package com.bisa.configclient.spring;

import com.bisa.configclient.configuration.CloudConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

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

    @GetMapping("/variable/all")
    public HashMap<String, String> getAllEnvVariable() {

        HashMap<String, String> map = new HashMap<>();
        map.put("Git example", this.cloudConfiguration.getSample());
        map.put("Vault secretKey", this.cloudConfiguration.getSecretKey());

        return map;
    }
}

