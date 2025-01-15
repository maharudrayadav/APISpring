package com.example.demo.ServiceImp;

import com.example.demo.Service.Service;

import java.util.Arrays;
import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Override
    public List<String> getStudentName() {
        List <String> asList=Arrays.asList("ram","shyam","rahul");
        return asList;
    }
}
