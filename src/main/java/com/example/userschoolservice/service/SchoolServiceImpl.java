package com.example.userschoolservice.service;

import com.example.userschoolservice.model.School;
import com.example.userschoolservice.model.User;
import com.example.userschoolservice.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Override
    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public School getSchool(Integer id) {
        return schoolRepository.getById(id);
    }

    @Override
    public School updateSchool(School school, Integer id) {
        return schoolRepository.findById(id).get();
    }

    @Override
    public void deleteSchool(Integer id) {
        School school = schoolRepository.findById(id).get();
        schoolRepository.delete(school);
    }

    @Override
    public School getSchoolByName(String name) {
        return  schoolRepository.getByName(name);
    }


}
