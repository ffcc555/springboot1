package com.chen.Service;

import com.chen.Mapper.BillMapper;
import com.chen.pojo.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BillService {
    @Autowired
    BillMapper billMapper;
    public static List<Bill> queryBillBySql(int currPage, int pageSize) {
        Map<String, Object> data = new HashMap<>();
        data.put("currPage", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);

        return BillMapper.queryBillBySql(data);
    }



}




