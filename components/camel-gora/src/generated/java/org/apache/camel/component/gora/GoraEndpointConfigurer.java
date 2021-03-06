/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.gora;

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
public class GoraEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("name", java.lang.String.class);
        map.put("dataStoreClass", java.lang.String.class);
        map.put("keyClass", java.lang.String.class);
        map.put("valueClass", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("concurrentConsumers", int.class);
        map.put("endKey", java.lang.Object.class);
        map.put("endTime", long.class);
        map.put("fields", com.google.common.base.Strings.class);
        map.put("keyRangeFrom", java.lang.Object.class);
        map.put("keyRangeTo", java.lang.Object.class);
        map.put("limit", long.class);
        map.put("startKey", java.lang.Object.class);
        map.put("startTime", long.class);
        map.put("timeRangeFrom", long.class);
        map.put("timeRangeTo", long.class);
        map.put("timestamp", long.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("flushOnEveryOperation", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("hadoopConfiguration", org.apache.hadoop.conf.Configuration.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoraEndpoint target = (GoraEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.getConfiguration().setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "datastoreclass":
        case "dataStoreClass": target.getConfiguration().setDataStoreClass(property(camelContext, java.lang.String.class, value)); return true;
        case "endkey":
        case "endKey": target.getConfiguration().setEndKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "endtime":
        case "endTime": target.getConfiguration().setEndTime(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fields": target.getConfiguration().setFields(property(camelContext, com.google.common.base.Strings.class, value)); return true;
        case "flushoneveryoperation":
        case "flushOnEveryOperation": target.getConfiguration().setFlushOnEveryOperation(property(camelContext, boolean.class, value)); return true;
        case "hadoopconfiguration":
        case "hadoopConfiguration": target.getConfiguration().setHadoopConfiguration(property(camelContext, org.apache.hadoop.conf.Configuration.class, value)); return true;
        case "keyclass":
        case "keyClass": target.getConfiguration().setKeyClass(property(camelContext, java.lang.String.class, value)); return true;
        case "keyrangefrom":
        case "keyRangeFrom": target.getConfiguration().setKeyRangeFrom(property(camelContext, java.lang.Object.class, value)); return true;
        case "keyrangeto":
        case "keyRangeTo": target.getConfiguration().setKeyRangeTo(property(camelContext, java.lang.Object.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "limit": target.getConfiguration().setLimit(property(camelContext, long.class, value)); return true;
        case "startkey":
        case "startKey": target.getConfiguration().setStartKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "starttime":
        case "startTime": target.getConfiguration().setStartTime(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timerangefrom":
        case "timeRangeFrom": target.getConfiguration().setTimeRangeFrom(property(camelContext, long.class, value)); return true;
        case "timerangeto":
        case "timeRangeTo": target.getConfiguration().setTimeRangeTo(property(camelContext, long.class, value)); return true;
        case "timestamp": target.getConfiguration().setTimestamp(property(camelContext, long.class, value)); return true;
        case "valueclass":
        case "valueClass": target.getConfiguration().setValueClass(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoraEndpoint target = (GoraEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConfiguration().getConcurrentConsumers();
        case "datastoreclass":
        case "dataStoreClass": return target.getConfiguration().getDataStoreClass();
        case "endkey":
        case "endKey": return target.getConfiguration().getEndKey();
        case "endtime":
        case "endTime": return target.getConfiguration().getEndTime();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fields": return target.getConfiguration().getFields();
        case "flushoneveryoperation":
        case "flushOnEveryOperation": return target.getConfiguration().isFlushOnEveryOperation();
        case "hadoopconfiguration":
        case "hadoopConfiguration": return target.getConfiguration().getHadoopConfiguration();
        case "keyclass":
        case "keyClass": return target.getConfiguration().getKeyClass();
        case "keyrangefrom":
        case "keyRangeFrom": return target.getConfiguration().getKeyRangeFrom();
        case "keyrangeto":
        case "keyRangeTo": return target.getConfiguration().getKeyRangeTo();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "limit": return target.getConfiguration().getLimit();
        case "startkey":
        case "startKey": return target.getConfiguration().getStartKey();
        case "starttime":
        case "startTime": return target.getConfiguration().getStartTime();
        case "synchronous": return target.isSynchronous();
        case "timerangefrom":
        case "timeRangeFrom": return target.getConfiguration().getTimeRangeFrom();
        case "timerangeto":
        case "timeRangeTo": return target.getConfiguration().getTimeRangeTo();
        case "timestamp": return target.getConfiguration().getTimestamp();
        case "valueclass":
        case "valueClass": return target.getConfiguration().getValueClass();
        default: return null;
        }
    }
}

