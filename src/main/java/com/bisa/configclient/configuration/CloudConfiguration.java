package com.bisa.configclient.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 17/7/2020
 */
@RefreshScope
@Configuration
@Getter
public class CloudConfiguration {

    @Value("${secretKey: Error loading from vault...}")
    private String secretKey;

    @Value("${sample.property: Error loading from git...}")
    private String sample;

    @Value("${ciam.provider.api-key: NOT_FOUND}")
    private String ciamAPIKey;

    @Value("${ciam.provider.secret: NOT_FOUND}")
    private String ciamSecret;

    @Value("${ciam.server.appinfo.url: NOT_FOUND}")
    private String ciamAppInfoUrl;

    @Value("${ciam.server.api.url: NOT_FOUND}")
    private String ciamAPIUrl;
}
