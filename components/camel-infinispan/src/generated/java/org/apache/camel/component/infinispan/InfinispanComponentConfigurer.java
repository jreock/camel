/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.infinispan;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class InfinispanComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("configuration", org.apache.camel.component.infinispan.InfinispanConfiguration.class);
        map.put("hosts", java.lang.String.class);
        map.put("queryBuilder", org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
        map.put("secure", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("clusteredListener", boolean.class);
        map.put("command", java.lang.String.class);
        map.put("customListener", org.apache.camel.component.infinispan.InfinispanCustomListener.class);
        map.put("eventTypes", java.lang.String.class);
        map.put("sync", boolean.class);
        map.put("defaultValue", java.lang.Object.class);
        map.put("key", java.lang.Object.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("oldValue", java.lang.Object.class);
        map.put("operation", org.apache.camel.component.infinispan.InfinispanOperation.class);
        map.put("value", java.lang.Object.class);
        map.put("password", java.lang.String.class);
        map.put("saslMechanism", java.lang.String.class);
        map.put("securityRealm", java.lang.String.class);
        map.put("securityServerName", java.lang.String.class);
        map.put("username", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("cacheContainer", org.infinispan.commons.api.BasicCacheContainer.class);
        map.put("cacheContainerConfiguration", java.lang.Object.class);
        map.put("configurationProperties", java.util.Map.class);
        map.put("configurationUri", java.lang.String.class);
        map.put("flags", java.lang.String.class);
        map.put("remappingFunction", java.util.function.BiFunction.class);
        map.put("resultHeader", java.lang.Object.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.infinispan.InfinispanConfiguration getOrCreateConfiguration(InfinispanComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.infinispan.InfinispanConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        InfinispanComponent target = (InfinispanComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachecontainer":
        case "cacheContainer": getOrCreateConfiguration(target).setCacheContainer(property(camelContext, org.infinispan.commons.api.BasicCacheContainer.class, value)); return true;
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": getOrCreateConfiguration(target).setCacheContainerConfiguration(property(camelContext, java.lang.Object.class, value)); return true;
        case "clusteredlistener":
        case "clusteredListener": getOrCreateConfiguration(target).setClusteredListener(property(camelContext, boolean.class, value)); return true;
        case "command": getOrCreateConfiguration(target).setCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.infinispan.InfinispanConfiguration.class, value)); return true;
        case "configurationproperties":
        case "configurationProperties": getOrCreateConfiguration(target).setConfigurationProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "configurationuri":
        case "configurationUri": getOrCreateConfiguration(target).setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "customlistener":
        case "customListener": getOrCreateConfiguration(target).setCustomListener(property(camelContext, org.apache.camel.component.infinispan.InfinispanCustomListener.class, value)); return true;
        case "defaultvalue":
        case "defaultValue": getOrCreateConfiguration(target).setDefaultValue(property(camelContext, java.lang.Object.class, value)); return true;
        case "eventtypes":
        case "eventTypes": getOrCreateConfiguration(target).setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "flags": getOrCreateConfiguration(target).setFlags(property(camelContext, java.lang.String.class, value)); return true;
        case "hosts": getOrCreateConfiguration(target).setHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "oldvalue":
        case "oldValue": getOrCreateConfiguration(target).setOldValue(property(camelContext, java.lang.Object.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.infinispan.InfinispanOperation.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "querybuilder":
        case "queryBuilder": getOrCreateConfiguration(target).setQueryBuilder(property(camelContext, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class, value)); return true;
        case "remappingfunction":
        case "remappingFunction": getOrCreateConfiguration(target).setRemappingFunction(property(camelContext, java.util.function.BiFunction.class, value)); return true;
        case "resultheader":
        case "resultHeader": getOrCreateConfiguration(target).setResultHeader(property(camelContext, java.lang.Object.class, value)); return true;
        case "saslmechanism":
        case "saslMechanism": getOrCreateConfiguration(target).setSaslMechanism(property(camelContext, java.lang.String.class, value)); return true;
        case "secure": getOrCreateConfiguration(target).setSecure(property(camelContext, boolean.class, value)); return true;
        case "securityrealm":
        case "securityRealm": getOrCreateConfiguration(target).setSecurityRealm(property(camelContext, java.lang.String.class, value)); return true;
        case "securityservername":
        case "securityServerName": getOrCreateConfiguration(target).setSecurityServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "sync": getOrCreateConfiguration(target).setSync(property(camelContext, boolean.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "value": getOrCreateConfiguration(target).setValue(property(camelContext, java.lang.Object.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        InfinispanComponent target = (InfinispanComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cachecontainer":
        case "cacheContainer": return getOrCreateConfiguration(target).getCacheContainer();
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": return getOrCreateConfiguration(target).getCacheContainerConfiguration();
        case "clusteredlistener":
        case "clusteredListener": return getOrCreateConfiguration(target).isClusteredListener();
        case "command": return getOrCreateConfiguration(target).getCommand();
        case "configuration": return target.getConfiguration();
        case "configurationproperties":
        case "configurationProperties": return getOrCreateConfiguration(target).getConfigurationProperties();
        case "configurationuri":
        case "configurationUri": return getOrCreateConfiguration(target).getConfigurationUri();
        case "customlistener":
        case "customListener": return getOrCreateConfiguration(target).getCustomListener();
        case "defaultvalue":
        case "defaultValue": return getOrCreateConfiguration(target).getDefaultValue();
        case "eventtypes":
        case "eventTypes": return getOrCreateConfiguration(target).getEventTypes();
        case "flags": return getOrCreateConfiguration(target).getFlags();
        case "hosts": return getOrCreateConfiguration(target).getHosts();
        case "key": return getOrCreateConfiguration(target).getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "oldvalue":
        case "oldValue": return getOrCreateConfiguration(target).getOldValue();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "querybuilder":
        case "queryBuilder": return getOrCreateConfiguration(target).getQueryBuilder();
        case "remappingfunction":
        case "remappingFunction": return getOrCreateConfiguration(target).getRemappingFunction();
        case "resultheader":
        case "resultHeader": return getOrCreateConfiguration(target).getResultHeader();
        case "saslmechanism":
        case "saslMechanism": return getOrCreateConfiguration(target).getSaslMechanism();
        case "secure": return getOrCreateConfiguration(target).isSecure();
        case "securityrealm":
        case "securityRealm": return getOrCreateConfiguration(target).getSecurityRealm();
        case "securityservername":
        case "securityServerName": return getOrCreateConfiguration(target).getSecurityServerName();
        case "sync": return getOrCreateConfiguration(target).isSync();
        case "username": return getOrCreateConfiguration(target).getUsername();
        case "value": return getOrCreateConfiguration(target).getValue();
        default: return null;
        }
    }
}

