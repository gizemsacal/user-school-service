package com.example.userschoolservice.service;

import com.example.userschoolservice.model.School;
import com.example.userschoolservice.model.User;

import java.util.List;

public interface SchoolService {

        public School createSchool(School school);

        public School getSchool(Integer id);

        public School updateSchool(School school, Integer id);

        public void deleteSchool(Integer id);

        public School getSchoolByName(String name);



}
