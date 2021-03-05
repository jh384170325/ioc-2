package com.woniu.mapper.impl;

import com.woniu.domain.Student;
import com.woniu.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao implements StudentMapper {
    public void add() {
        System.out.println("新增操作");
    }

    @Override
    public void updata() {
        System.out.println("修改操作");
    }

    @Override
    public void delete() {
        System.out.println("删除操作");
    }

    @Override
    public void select(Student student) {
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }


}