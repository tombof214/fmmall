package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.service.IndexService;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/index")
@CrossOrigin
@ResponseBody
@Api(value = "首页控制", tags = "首页接口")
public class IndexImgController {
        @Autowired(required = false)
        private IndexService indexService;

        @ApiOperation("获取轮播图信息接口")
        @GetMapping("/indeximg")
        public ResultVO getIndexImg(){
            return indexService.getIndexImg();
        }
        @ApiOperation("获取全部ID接口")
        @GetMapping("/categoryIds")
        @ApiImplicitParam(name = "init_parent_id", value = "parent_id",defaultValue = "0",required = false,dataType = "Integer")
        public ResultVO getCategoryIds(@RequestParam("init_parent_id") int pid){
                ResultVO categoryIds = indexService.getCategoryIds(pid);
                return categoryIds;

        }
        @GetMapping("/popularitems")
        @ApiOperation("获取前三销量商品的接口")
        public ResultVO getThreeItems(){
                return  indexService.getMostSoldProducts();
        }
}
