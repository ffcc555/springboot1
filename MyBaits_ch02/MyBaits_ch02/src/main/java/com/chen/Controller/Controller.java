package com.chen.Controller;

import com.chen.Service.BillService;
import com.chen.Mapper.BillMapper;
import com.chen.pojo.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BillMapper billMapper;

    @RequestMapping("/insert")
    public int insert(){
        Bill bill = new Bill();
        bill.setId(18);
        bill.setBillCode("2020_00018");
        bill.setProductName("芬达");
        bill.setProductDesc("饮料");
        bill.setProductUnit("瓶");
        bill.setProductCount(BigDecimal.valueOf(1500.00));
        bill.setTotalPrice(BigDecimal.valueOf(6666));
        bill.setIsPayment(1);
        return billMapper.insert(bill);
    }

    @RequestMapping("/update")
    public int update(){
        Bill bill = new Bill();
        bill.setId(18);
        bill.setBillCode("2020_00018");
        bill.setProductName("芬达123");
        bill.setProductDesc("饮料");
        bill.setProductUnit("瓶");
        bill.setProductCount(BigDecimal.valueOf(1500.00));
        bill.setTotalPrice(BigDecimal.valueOf(6666));
        bill.setIsPayment(1);
        return billMapper.update(bill);
    }

    @RequestMapping("/findAll")
    public List<Bill> findAll(){
        Bill bill = new Bill();
        bill.setProductDesc("饮料");
            return billMapper.findAll(bill);
    }

    @RequestMapping("/select5000")
    public List<Bill> select5000(){
        Bill bill = new Bill();
        return billMapper.select5000(bill);
    }

//    分页查询
//    @ResponseBody
//    @RequestMapping("/bill/{currPage}/{pageSize}")
//    public  List<Bill> queryBillBySql(@PathVariable("currPage") Integer currPage, @PathVariable("pageSize") Integer pageSize) {
//        List<Bill> bill = BillService.queryBillBySql(currPage, pageSize);
//        return bill;
//    }
//

    @ResponseBody
    @RequestMapping("/bill/{currPage}/{pageSize}")
    public  List<Bill> queryBillBySql(@PathVariable("currPage") Integer currPage, @PathVariable("pageSize") Integer pageSize) {
        List<Bill> bill = BillService.queryBillBySql(currPage, pageSize);
        return bill;
    }

}
























































