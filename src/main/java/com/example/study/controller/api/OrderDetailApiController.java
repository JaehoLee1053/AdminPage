package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.OrderDetailRequest;
import com.example.study.model.network.response.OrderDetailResponse;
import com.example.study.service.OrderDetailApiLogicService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderDetail")
public class OrderDetailApiController implements CrudInterface<OrderDetailRequest, OrderDetailResponse> {

    @Autowired
    OrderDetailApiLogicService orderDetailApiLogicService;

    @Override
    @PostMapping("")
    public Header<OrderDetailResponse> create(@RequestBody Header<OrderDetailRequest> request) {
        return orderDetailApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<OrderDetailResponse> read(@PathVariable Long id) {
        return orderDetailApiLogicService.read(id);
    }

    @Override
    public Header<OrderDetailResponse> update(Header<OrderDetailRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }

}
