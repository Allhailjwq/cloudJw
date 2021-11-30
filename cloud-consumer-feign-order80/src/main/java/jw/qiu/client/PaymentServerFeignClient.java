package jw.qiu.client;

import com.jw.qiu.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentServerFeignClient {

    @RequestMapping("/payment/selectOne/{serno}")
     CommonResult selectOne(@PathVariable(value="serno") String serno);


}
