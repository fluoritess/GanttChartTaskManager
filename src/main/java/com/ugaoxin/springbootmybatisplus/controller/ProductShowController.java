package com.ugaoxin.springbootmybatisplus.controller;

import com.alibaba.fastjson.JSON;
import com.ugaoxin.springbootmybatisplus.pojo.ProductData;
import com.ugaoxin.springbootmybatisplus.pojo.ProductLinks;
import com.ugaoxin.springbootmybatisplus.service.ProductDataService;
import com.ugaoxin.springbootmybatisplus.service.ProductLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author wsw
 * @Package com.ugoxin.springbootmybatisplus.controller
 * @Description:甘特图展示conteoller
 * @date 2019年5月9日 18:32:41
 */
@RestController
public class ProductShowController {

  @Autowired
  private ProductDataService  productDataService;
  @Autowired
  private ProductLinksService  productLinksService;

    /*
     * 获取product_data 和product_links中的值，且转换为json
     */
    @RequestMapping("getData")
    public  String getData(){
        // 1.获取product_data 的数据
        List<ProductData> dataList= productDataService.list();
        // 2.获取product_links的数据
         List<ProductLinks> linksList =productLinksService.list();
        // 3.合二为一转为json
        Map map = new HashMap<String,Object>();
        map.put("data",dataList);
        map.put("links",linksList);
        String res = JSON.toJSONString(map);
        return res;
    }
    /*
     * add 项目
     */
    @RequestMapping("doAdd")
    public  int doAdd(ProductData productData,String start_date,String end_date){

        int i=0;
        productData.setStartDate(start_date.split(",")[0]);
        productData.setEndDate(end_date.split(",")[0]);
        Integer id=productDataService.count()+1;
        productData.setId(id.longValue());
        boolean b = productDataService.save(productData);
        if(b){
            i=1;
        }
        return i;
    }

    /*
     * update项目
     */
    @RequestMapping("doUpdate")
    public  int doUpdate(ProductData productData,String start_date,String end_date){

        int i=0;
        productData.setStartDate(start_date.split(",")[0]);
        productData.setEndDate(end_date.split(",")[0]);
        boolean b = productDataService.saveOrUpdate(productData);

        if(b){
            i=1;
        }
        return i;
    }
   /*
    *删除task
    */
   @RequestMapping("doDelete")
    public int doDelete(String id){
       int i=0;
       boolean b = productDataService.removeById(id);
       if(b){
           i=1;
       }
       return i;
   }

    /*
     * 添加Link关系
     */
    @RequestMapping("doAddLink")
    public int doAddLink(ProductLinks productLinks){
        int i =0;
        Integer id=productLinksService.count()+1;
        productLinks.setId(id.longValue());
        boolean b = productLinksService.save(productLinks);
        if(b){
            i=1;
        }
        return i;
    }

    /*
     *更新link关系的doUpdate
     */
    @RequestMapping("doUpdateLink")
    public int doUpdateLink(ProductLinks productLinks){
        int i =0;
        boolean b = productLinksService.saveOrUpdate(productLinks);
        if(b) {
            i=1;
        }
        return i;
    }

    /*
     *删除关系
     */
    @RequestMapping("doDeleteLink")
    public int doDeleteLink(String id){
        int i=0;
        boolean b = productLinksService.removeById(id);
        if(b){
            i=1;
        }
        return i;
    }
}
