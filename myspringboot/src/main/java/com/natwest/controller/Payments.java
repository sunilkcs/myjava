package com.natwest.controller;

import com.natwest.model.IcbPimsProxyAction;
import com.natwest.model.PaymentRequestBody;
import com.natwest.model.PaymentResponseBody;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1")
public class Payments {

    @ApiOperation(value = "Proxy a payment request to PIMS via the ICB Permission Tier.",response = PaymentResponseBody.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request to ICB PIMS proxy was successful"),
            @ApiResponse(code = 400, message = "One of the enum parameters has an incorrect value, or the payment hash header was missing for REGPAY requests"),
            @ApiResponse(code = 401, message = "JWT is invalid"),
            @ApiResponse(code = 500, message = "Error receiving transaction report"),
            @ApiResponse(code = 502, message = "There is an issue with ICB"),
            @ApiResponse(code = 504, message = "Request to ICB timed out")
    }
    )
    @PostMapping(value = "/icbPimsProxy/{icbPimsProxyAction}", produces = "application/json")
    public ResponseEntity<PaymentResponseBody> icbPimsProxy(@PathVariable("icbPimsProxyAction") IcbPimsProxyAction icbPimsProxyAction, @RequestBody PaymentRequestBody paymentRequestBody) {
        return new ResponseEntity<PaymentResponseBody>(new PaymentResponseBody(), HttpStatus.OK);
    }

}
