package com.example.demo;

import com.example.ws.GetNameRequest;
import com.example.ws.GetNameResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class NameProviderEndpoint {

    private static final String NAMESPACE_URI = "http://ws.example.com/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetNameRequest")
    @ResponsePayload
    public GetNameResponse getServiceName(@RequestPayload GetNameRequest request) {
        GetNameResponse response = new GetNameResponse();
        response.setReturn("Service "+request.getArg0());
        return response;
    }

}
