/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.apimgt.gateway.cli.model.definition;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.wso2.apimgt.gateway.cli.model.route.EndpointListRouteDTO;


/**
 * This class represents the DTO for Single Path in API in Microgateway Definition.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EndpointListDefinition {
    private EndpointListRouteDTO prodEndpointList;
    private EndpointListRouteDTO sandEndpointList;
    private String requestInterceptor;
    private String responseInterceptor;
    private String throttlePolicy;

    @JsonProperty("production_endpoint")
    public EndpointListRouteDTO getProdEndpointList() {
        return prodEndpointList;
    }

    public void setProdEndpointList(EndpointListRouteDTO prodEndpointList) {
        this.prodEndpointList = prodEndpointList;
    }

    @JsonProperty("sandbox_endpoint")
    public EndpointListRouteDTO getSandEndpointList() {
        return sandEndpointList;
    }

    public void setSandEndpointList(EndpointListRouteDTO sandEndpointList) {
        this.sandEndpointList = sandEndpointList;
    }

    @JsonProperty("request_interceptor")
    public String getRequestInterceptor() {
        return requestInterceptor;
    }

    public void setRequestInterceptor(String requestInterceptor) {
        this.requestInterceptor = requestInterceptor;
    }

    @JsonProperty("response_interceptor")
    public String getResponseInterceptor() {
        return responseInterceptor;
    }

    public void setResponseInterceptor(String responseInterceptor) {
        this.responseInterceptor = responseInterceptor;
    }


    @JsonProperty("throttle_policy")
    public String getThrottlePolicy() {
        return throttlePolicy;
    }

    public void setThrottlePolicy(String throttlePolicy) {
        this.throttlePolicy = throttlePolicy;
    }
}
