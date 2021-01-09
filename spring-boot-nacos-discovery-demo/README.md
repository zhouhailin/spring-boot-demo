# spring boot nacos discrvery

## properties

    com.alibaba.boot.nacos.discovery.properties.NacosDiscoveryProperties

## demo url

    http://localhost:8081/discovery/get?serviceName=spring-boot-nacos-discovery-demo

## NamingService api

    register instance
    
        com.alibaba.nacos.api.naming.NamingService.registerInstance(java.lang.String, java.lang.String, int)

    deregister instance

        com.alibaba.nacos.api.naming.NamingService.deregisterInstance(java.lang.String, java.lang.String, int)

    get all instance
    
        com.alibaba.nacos.api.naming.NamingService.getAllInstances(java.lang.String)

    select instance

        com.alibaba.nacos.api.naming.NamingService.selectInstances(java.lang.String, boolean, boolean)

    select one healthy instance

        com.alibaba.nacos.api.naming.NamingService.selectOneHealthyInstance(java.lang.String)

    subscribe event listener(instance online/offline)
        
        com.alibaba.nacos.api.naming.NamingService.subscribe(java.lang.String, com.alibaba.nacos.api.naming.listener.EventListener)
    
    unsubscribe event listener
    
        com.alibaba.nacos.api.naming.NamingService.unsubscribe(java.lang.String, com.alibaba.nacos.api.naming.listener.EventListener)