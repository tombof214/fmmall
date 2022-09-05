package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.ApiApplication;
import com.qfedu.fmmall.entity.Category;
import com.qfedu.fmmall.entity.CategoryVO;
import com.qfedu.fmmall.entity.UserAddr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class CategoryVOTest {
    @Autowired(required = false)
    private CategoryMapper categoryMapper;
    @Autowired
    private UserAddrMapper userAddrMapper;
    @Test
    public void TestResult(){
        List<CategoryVO> categoryVOS = categoryMapper.getCategoryVOS(0);
        for (CategoryVO c1: categoryVOS
             ) {
            System.out.println(c1);
            for (CategoryVO c2: categoryVOS
                 ) {
                System.out.println(" " + c2);
                for (CategoryVO c3: categoryVOS
                     ) {
                    System.out.println("  " + c3);
                }
            }
        }
        System.out.println(categoryVOS);
    }
    @Test
    public void Test2(){


    }
    @Test
    public void t1(){
        List<Category> categories = categoryMapper.selectAll();
        System.out.println(categories);

    }
}
