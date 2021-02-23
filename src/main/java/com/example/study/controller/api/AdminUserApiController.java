package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.AdminUserApiRequest;
import com.example.study.model.network.response.AdminUserApiResponse;
import com.example.study.service.AdminUserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adminUser")
public class AdminUserApiController implements CrudInterface<AdminUserApiRequest, AdminUserApiResponse> {

    @Autowired
    AdminUserApiLogicService adminApiLogicService;

    @Override
    @PostMapping("")
    public Header<AdminUserApiResponse> create(@RequestBody Header<AdminUserApiRequest> request) {
        return adminApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<AdminUserApiResponse> read(@PathVariable Long id) {
        return adminApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<AdminUserApiResponse> update(@RequestBody Header<AdminUserApiRequest> request) {
        return adminApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return adminApiLogicService.delete(id);
    }
}
