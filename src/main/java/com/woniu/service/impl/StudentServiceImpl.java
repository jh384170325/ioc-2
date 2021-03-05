package com.woniu.service.impl;

import com.woniu.domain.Student;
import com.woniu.mapper.StudentMapper;
import com.woniu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper userMapper;

    @Override
    public void save() {
        userMapper.add();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updata() {
        userMapper.updata();
    }

    @Override
    public void delete() {
        userMapper.delete();
    }

    @Override
    public void select(Student student) {
        userMapper.select(student);
    }


}
