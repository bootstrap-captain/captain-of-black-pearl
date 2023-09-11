package com.black.pearl.dao;

import com.black.pearl.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*CREATE TABLE student
(
    id          INT AUTO_INCREMENT,
    name        VARCHAR(100),
    id_no       INT,
    address     VARCHAR(100),
    first_info  VARCHAR(100),
    second_info VARCHAR(100),
    third_info  VARCHAR(100),
    other       VARCHAR(100),
    PRIMARY KEY (id),
    INDEX name_index (name),
    UNIQUE INDEX id_no_index (id_no),
    INDEX address_index (address),
    INDEX multi_info_index (first_info, second_info, third_info)
)*/
@Repository
@Mapper
public interface StudentDao {

    /**/

    void largeBatchInsert(List<Student> students);
}
