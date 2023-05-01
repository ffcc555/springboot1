package com.chen.controller;


import com.chen.pojo.Emp;
import com.chen.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;

@RestController
public class EmpController {
    @RequestMapping ("/listEmp")
    public Result list(){
        String file =this.getClass().getClassLoader().getResource("enm.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else{
                emp.setGender("女");
            }

            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }

        });

        return (Result) com.chen.pojo.Result.success(empList);





    }
}
