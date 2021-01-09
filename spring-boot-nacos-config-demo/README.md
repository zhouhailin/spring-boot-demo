# spring boot nacos config

## properties

    com.alibaba.boot.nacos.config.properties.NacosConfigProperties

## demo url

    http://localhost:8080/config/get

## ConfigService api

    get config

        com.alibaba.nacos.api.config.ConfigService.getConfig

    get config and register listener

        com.alibaba.nacos.api.config.ConfigService.getConfigAndSignListener

    remove config

        com.alibaba.nacos.api.config.ConfigService.removeConfig

    add listener
    
        com.alibaba.nacos.api.config.ConfigService.addListener

    remove listener

        com.alibaba.nacos.api.config.ConfigService.removeListener

    publish config 

        com.alibaba.nacos.api.config.ConfigService.publishConfig

    get server status (UP/DOWN)

        com.alibaba.nacos.api.config.ConfigService.getServerStatus
