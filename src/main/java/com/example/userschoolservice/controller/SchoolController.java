package com.example.userschoolservice.controller;

import com.example.userschoolservice.model.School;
import com.example.userschoolservice.model.User;
import com.example.userschoolservice.service.SchoolService;
import com.example.userschoolservice.service.SchoolServiceImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api")
public class SchoolController {
    private SchoolService schoolService;

    final SchoolService schoolServiceImpl;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/school")
    School creatSchool(@RequestBody School school) {
        return schoolServiceImpl.createSchool(school);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/school/id/{id}")
    public School getSchool(@PathVariable Integer id) {
        return schoolServiceImpl.getSchool(id);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/school/name/{name}")
    public School getSchoolByName(@PathVariable String name) {
        return schoolServiceImpl.getSchoolByName(name);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/school/{id}")
    School updateSchool(@RequestBody School school, @PathVariable Integer id) {
        return schoolServiceImpl.updateSchool(school, id);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("school/{id}")
    public void deleteSchool(@PathVariable Integer id) {
        schoolServiceImpl.deleteSchool(id);
    }

}
