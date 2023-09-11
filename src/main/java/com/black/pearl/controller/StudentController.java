package com.black.pearl.controller;

import com.black.pearl.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
@RequiredArgsConstructor
public class StudentController {

    private StudentService studentService;

    @GetMapping("/large/batch/insert")
    public void largeBatch(){
        studentService.largeBatchInsert();
    }

}
