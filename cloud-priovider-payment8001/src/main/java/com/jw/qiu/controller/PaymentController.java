package com.jw.qiu.controller;

import com.jw.qiu.entity.CommonResult;
import com.jw.qiu.entity.Payment;
import com.jw.qiu.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentServices paymentServices;

    @Value("${server.port}")
    private String port;

    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment){
        return paymentServices.create(payment);
    }

    @GetMapping("/payment/selectOne/{serno}")
    public CommonResult selectBySerno(@PathVariable String serno){
        CommonResult bySerno = paymentServices.getBySerno(serno);
        bySerno.setMsg(port);
        return bySerno;
    }

}
