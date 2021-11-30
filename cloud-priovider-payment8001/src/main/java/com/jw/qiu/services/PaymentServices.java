package com.jw.qiu.services;

import com.alibaba.druid.util.StringUtils;
import com.jw.qiu.dao.PaymentMapper;
import com.jw.qiu.entity.CommonResult;
import com.jw.qiu.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServices {
    @Autowired
    PaymentMapper paymentMapper;

    public  CommonResult create(Payment payment){
        String payserno = payment.getPayserno();
        if(StringUtils.isEmpty(payserno)){
            return CommonResult.error("订单流水号不能为空");
        }
        int insert = paymentMapper.insert(payment);
        if(insert>0){
            return CommonResult.createSuccess(payment);
        }else{
            return CommonResult.error("插入数据库失败");
        }
    }

    public  CommonResult getBySerno(String serno){
        Payment payment = new Payment();
        payment.setPayserno(serno);
        Payment payment1 = paymentMapper.selectOne(payment);
        return CommonResult.createSuccess(payment1);
    }
}
