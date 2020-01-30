package com.natwest.controller;

import com.natwest.model.AccountBalance;
import com.natwest.model.AccountFlagsDomesticResponse;
import com.natwest.model.AccountFlagsInternationalResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RetrieveAccountsDetails {

    @ApiOperation(value = "Lookup account balance for a domestic account.",response = AccountBalance.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetching account balance from ESP was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 502, message = "There is an issue with ESP")
    }
    )
    @RequestMapping(value = "/account/{brand}/{sortCode}/{accountNumber}/balance", method= RequestMethod.GET, produces = "application/json")
    public AccountBalance lookupDomesticAccountBalance(@PathVariable("brand") String brand, @PathVariable("sortCode") String sortCode, @PathVariable("accountNumber") String accountNumber)
    {
        return new AccountBalance();
    }

    @ApiOperation(value = "Lookup account balance for an international account.",response = AccountBalance.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetching account balance from ESP was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 502, message = "There is an issue with ESP")
    }
    )
    @RequestMapping(value = "/account/{brand}/{customerKey}/{currency}/{accountIdSuffix}/balance", method= RequestMethod.GET, produces = "application/json")
    public AccountBalance lookupInternationalAccountBalance(@PathVariable("brand") String brand, @PathVariable("customerKey") String customerKey, @PathVariable("currency") String currency, @PathVariable("accountIdSuffix") String accountIdSuffix)
    {
        return new AccountBalance();
    }


    @ApiOperation(value = "Lookup account flags for a domestic account.",response = AccountFlagsDomesticResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetching account flags from ESP was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 502, message = "There is an issue with ESP")
    }
    )
    @RequestMapping(value = "/account/{brand}/{sortCode}/{accountNumber}/flags", method= RequestMethod.GET, produces = "application/json")
    public AccountFlagsDomesticResponse lookupDomesticAccountFlags(@PathVariable("brand") String brand, @PathVariable("sortCode") String sortCode, @PathVariable("accountNumber") String accountNumber)
    {
        return new AccountFlagsDomesticResponse();
    }

    @ApiOperation(value = "Lookup account flags for a International account.",response = AccountFlagsInternationalResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetching account flags from ESP was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 502, message = "There is an issue with ESP")
    }
    )
    @RequestMapping(value = "/account/{brand}/{customerKey}/{currency}/{accountIdSuffix}/flags", method= RequestMethod.GET, produces = "application/json")
    public AccountFlagsInternationalResponse lookupInternationalAccountFlags(@PathVariable("brand") String brand, @PathVariable("customerKey") String customerKey, @PathVariable("currency") String currency, @PathVariable("accountIdSuffix") String accountIdSuffix)
    {
        return new AccountFlagsInternationalResponse();
    }

}
