package com.chen.Mapper;


import com.chen.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


@Mapper
public interface BillMapper {
    int insert(Bill bill);
    int update(Bill bill);
    List<Bill> findAll(Bill bill);
    List<Bill> select5000(Bill bill);

    List<Bill> queryBillBySql(Map<String, Object> data);





}
