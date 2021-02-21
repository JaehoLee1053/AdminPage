package com.example.study.service;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.entity.OrderDetail;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.OrderDetailRequest;
import com.example.study.model.network.response.OrderDetailResponse;
import com.example.study.repository.ItemRepository;
import com.example.study.repository.OrderDetailRepository;
import com.example.study.repository.OrderGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailApiLogicService implements CrudInterface<OrderDetailRequest, OrderDetailResponse> {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderGroupRepository orderGroupRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Header<OrderDetailResponse> create(Header<OrderDetailRequest> request) {

        OrderDetailRequest body = request.getData();

        OrderDetail orderDetail = OrderDetail.builder()
                .status(body.getStatus())
                .arrivalDate(body.getArrivalTime())
                .quantity(body.getQuantity())
                .totalPrice(body.getTotalPrice())
                .orderGroup(orderGroupRepository.getOne(body.getOrderGroupId()))
                .item(itemRepository.getOne(body.getItemId()))
                .build();

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);

        return response(newOrderDetail);

    }

    @Override
    public Header<OrderDetailResponse> read(Long id) {

        return orderDetailRepository.findById(id)
                .map(this::response)
                .orElseGet(() -> Header.ERROR("데이터 없음"));

    }

    @Override
    public Header<OrderDetailResponse> update(Header<OrderDetailRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }

    private Header<OrderDetailResponse> response(OrderDetail orderDetail) {

        OrderDetailResponse body = OrderDetailResponse.builder()
                .id(orderDetail.getId())
                .status(orderDetail.getStatus())
                .arrivalTime(orderDetail.getArrivalDate())
                .quantity(orderDetail.getQuantity())
                .totalPrice(orderDetail.getTotalPrice())
                .createdAt(orderDetail.getCreatedAt())
                .createdBy(orderDetail.getCreatedBy())
                .updatedAt(orderDetail.getUpdatedAt())
                .updatedBy(orderDetail.getUpdatedBy())
                .itemId(orderDetail.getItem().getId())
                .orderGroupId(orderDetail.getOrderGroup().getId())
                .build();

        return Header.OK(body);

    }

}
