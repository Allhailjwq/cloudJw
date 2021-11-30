package jw.qiu.contraller;

import com.jw.qiu.entity.CommonResult;
import com.jw.qiu.entity.Payment;
import jw.qiu.client.PaymentServerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Order {

    @Autowired
    RestTemplate restTemplate;

    private final String url="CLOUD-PAYMENT-SERVICE";

    @Autowired
    private PaymentServerFeignClient paymentServerFeignClient;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/order/selectOne/{serno}")
    public CommonResult selectOne(@PathVariable String serno){
       return paymentServerFeignClient.selectOne(serno);
       // return restTemplate.getForObject("http://"+url+"/payment/selectOne/" + serno, CommonResult.class, serno);
    }


    @PostMapping("/payment/order/create")
    public CommonResult create(@RequestBody Payment payment){
        return restTemplate.postForObject("http://"+url+"/payment/create" ,  payment,CommonResult.class );

    }
}
