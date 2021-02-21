package com.example.study.model.network.request;

import com.example.study.model.enumclass.OrderStatus;
import jdk.vm.ci.meta.Local;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailRequest {

    private Long id;

    private OrderStatus status;

    private LocalDateTime arrivalTime;

    private Integer quantity;

    private BigDecimal totalPrice;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

    private Long orderGroupId;

    private Long itemId;

}
