package com.HVPO.HVPO.controller;

import com.HVPO.HVPO.model.principal;
import com.HVPO.HVPO.repository.principalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/principal")

public class principalApi {
    principal principal;
    @Autowired
    principalRepo principalRepo;
    @GetMapping("{schoolId}")
    public principal getPrincipal(Integer schoolId){
        return principal;
    }
    @PostMapping
    public String createPrincipalDetails(@RequestBody principal principal){
        principalRepo.save(principal);
        return "save success";

    }


}
