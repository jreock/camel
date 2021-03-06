/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ConsulEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiEndpoint";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(31);
        set.add("apiEndpoint");
        set.add("connectTimeout");
        set.add("connectTimeoutMillis");
        set.add("consulClient");
        set.add("key");
        set.add("pingInstance");
        set.add("readTimeout");
        set.add("readTimeoutMillis");
        set.add("tags");
        set.add("url");
        set.add("writeTimeout");
        set.add("writeTimeoutMillis");
        set.add("bridgeErrorHandler");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("action");
        set.add("lazyStartProducer");
        set.add("valueAsString");
        set.add("basicPropertyBinding");
        set.add("consistencyMode");
        set.add("datacenter");
        set.add("nearNode");
        set.add("nodeMeta");
        set.add("synchronous");
        set.add("aclToken");
        set.add("password");
        set.add("sslContextParameters");
        set.add("userName");
        set.add("blockSeconds");
        set.add("firstIndex");
        set.add("recursive");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "consul".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiEndpoint", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

