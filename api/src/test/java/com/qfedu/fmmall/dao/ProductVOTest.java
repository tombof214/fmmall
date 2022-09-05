package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.ApiApplication;
import com.qfedu.fmmall.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class ProductVOTest {
    @Autowired
    private ProductMapper productMapper;
    @Test
    public  void Test3(){
        List<Product> products = productMapper.selectBySoldNum();
        System.out.println(products);
    }
}
