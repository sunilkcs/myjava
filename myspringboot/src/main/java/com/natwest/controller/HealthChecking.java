package com.natwest.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HealthChecking {

    @ApiOperation(value = "Perform a simple health check.",response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Exchange is up"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 404, message = "Exchange is not up")
    }
    )
    @RequestMapping(value = "/health", method= RequestMethod.GET, produces = "application/json")
    public String healthCheck()
    {
        return "";
    }

}
