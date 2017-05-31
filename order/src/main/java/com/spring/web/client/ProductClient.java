package com.spring.web.client;

import com.spring.domain.model.Product;
import com.spring.domain.response.ObjectDataResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 产品接口
 * @Author ErnestCheng
 * @Date 2017/5/31.
 */
@FeignClient(name="product",fallbackFactory = ProductClientFallBack.class)
public interface ProductClient {

    @RequestMapping(value = "getProductId",method = RequestMethod.GET)
    ObjectDataResponse<Product> getProductById(@RequestParam("productId") Integer productId);


}
