package com.example.study.model.network.request;

import com.example.study.ifs.CrudInterface;
import jdk.vm.ci.meta.Local;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminUserApiRequest {

    private Long id;

    private String account;

    private String password;

    private String status;

    private String role;

    private LocalDateTime lastLoginAt;

    private LocalDateTime passwordUpdatedAt;

    private Integer loginFailCount;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredat;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;



}
