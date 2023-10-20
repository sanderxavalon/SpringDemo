package com.tibame.service;

import com.tibame.dao.DeptRepository;
import com.tibame.vo.DeptVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    DeptRepository deptRepository;

    public List<DeptVO> getAll() {
        return deptRepository.findAll();
    }

}
