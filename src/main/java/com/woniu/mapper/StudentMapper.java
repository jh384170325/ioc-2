package com.woniu.mapper;

import com.woniu.domain.Student;

public interface StudentMapper {
    void add();

    void updata();

    void delete();

    void select(Student student);
}
