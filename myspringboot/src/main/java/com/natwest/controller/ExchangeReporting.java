package com.natwest.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1")
public class ExchangeReporting {

    @ApiOperation(value = "Post a list of settled payments for reconciliation",response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Transaction report received successfully"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 500, message = "Error receiving transaction report")
    }
    )
    @PostMapping(value = "/reports/transactions", produces = "application/json")
    public ResponseEntity<String> reportingServicesLookup(HttpServletRequest request, @RequestBody String[] json) {
        return new ResponseEntity("String", HttpStatus.OK);
    }

}
