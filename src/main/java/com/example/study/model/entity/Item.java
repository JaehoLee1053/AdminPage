package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String name;
    private String title;
    private String content;
    private Integer price;
    private String brandName;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
    private Long partnerId;

//    // LAZY = 지연로딩, EAGER = 즉시로
//
//    // * 추천
//    // LAZY = SELECT * FROM  item where id = ?;
//    // 따로 GET method를 호출하지 않는 이상 다른 연관 관계 호출 않음
//
//    // 1:1 일 경우 추천
//    // EAGER =
//    // item_id = order_detail.item_id
//    // user_id = order_detail.user_id
//    // where item.id = ?;
//    // 연관 관계가 있는 것을 모두 호출
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
//    private List<OrderDetail> orderDetailList;
}
