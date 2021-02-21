package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.entity.OrderDetail;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.OrderDetailRequest;
import com.example.study.model.network.response.OrderDetailResponse;
import com.example.study.service.OrderDetailApiLogicService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    @PutMapping("")
    public Header<OrderDetailResponse> update(@RequestBody Header<OrderDetailRequest> request) {
        return orderDetailApiLogicService.update(request);

    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return orderDetailApiLogicService.delete(id);
    }

}
