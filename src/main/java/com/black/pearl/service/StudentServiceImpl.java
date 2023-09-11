package com.black.pearl.service;

import com.black.pearl.dao.StudentDao;
import com.black.pearl.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    @Override
    public void largeBatchInsert() {
        studentDao.largeBatchInsert(mockData());
    }

    /*mock data to insert 100,000 record*/
    private List<Student> mockData() {
        List<Student> result = new ArrayList<>();
        int idNo = 1000000;
        for (int i = 0; i < 100000; i++) {
            Student student = new Student();
            student.setIdNo(idNo++);
            student.setName(UUID.randomUUID().toString().replace("-", "").substring(0, 10));
            student.setAddress("china-" + UUID.randomUUID().toString().replace("-", "").substring(0, 4));
            student.setFirstInfo(UUID.randomUUID().toString().replace("-", "").substring(0, 6));
            student.setSecondInfo(UUID.randomUUID().toString().replace("-", "").substring(0, 6));
            student.setThirdInfo(UUID.randomUUID().toString().replace("-", "").substring(0, 6));
            student.setOther(UUID.randomUUID().toString().replace("-", "").substring(0, 4));
            result.add(student);
        }
        return result;
    }
}
