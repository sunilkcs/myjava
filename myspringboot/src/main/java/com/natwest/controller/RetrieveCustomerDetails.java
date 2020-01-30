package com.natwest.controller;

import com.natwest.model.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class RetrieveCustomerDetails {

    @ApiOperation(value = "Lookup customer details.",response = CustomerDetails.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetching customer details from ESP was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 502, message = "There is an issue with ESP")
    }
    )
    @RequestMapping(value = "/customer/{brand}/{cin}", method= RequestMethod.GET, produces = "application/json")
    public CustomerDetails getCustomerDetails(@PathVariable("brand") String brand, @PathVariable("cin") String cin, @RequestParam(value = "customerType",
            required = true) CustomerType customerType)
    {
        return new CustomerDetails();
    }

    @ApiOperation(value = "Lookup customer mandate from the ICB Permissions Tier.",response = MandateResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetching customer mandate from ICB was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 502, message = "There is an issue with ESP")
    }
    )
    @RequestMapping(value = "/customer/{cin}/mandate", method= RequestMethod.GET, produces = "application/json")
    public MandateResponse getCustomerMandate(@PathVariable("cin") String cin)
    {
        return new MandateResponse();
    }


    @ApiOperation(value = "Lookup accounts for given customer identifier and type, filtered by account type.",response = AccountDetails.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetching accounts from ESP was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 502, message = "There is an issue with ESP")
    }
    )
    @RequestMapping(value = "/customer/{brand}/{cin}/account", method= RequestMethod.GET, produces = "application/json")
    public AccountDetails getAccountDetails(@PathVariable("brand") String brand, @PathVariable("cin") String cin, @RequestParam(value = "customerType",
            required = true) CustomerType customerType, @RequestParam(value = "accountType",
            required = true) AccountType accountType)
    {
        return new AccountDetails();
    }
}
