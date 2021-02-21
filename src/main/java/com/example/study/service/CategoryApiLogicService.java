package com.example.study.service;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.entity.Category;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.CategoryApiRequest;
import com.example.study.model.network.response.CategoryApiResponse;
import com.example.study.repository.CategoryRepository;
import com.example.study.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CategoryApiLogicService implements CrudInterface<CategoryApiRequest, CategoryApiResponse> {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    PartnerRepository partnerRepository;

    @Override
    public Header<CategoryApiResponse> create(Header<CategoryApiRequest> request) {

        CategoryApiRequest categoryApiRequest = request.getData();

        Category category = Category.builder()
                .type(categoryApiRequest.getType())
                .title(categoryApiRequest.getTitle())
                .createdAt(LocalDateTime.now())
                .createdBy(categoryApiRequest.getCreatedBy())
                .build();

        Category newCategory = categoryRepository.save(category);

        return response(newCategory);
    }

    @Override
    public Header<CategoryApiResponse> read(Long id) {

        return categoryRepository.findById(id)
                .map(category -> response(category))
                .orElseGet(() -> Header.ERROR("데이터 없음"));

    }

    @Override
    public Header<CategoryApiResponse> update(Header<CategoryApiRequest> request) {

        CategoryApiRequest body = request.getData();

        return categoryRepository.findById(body.getId())
                .map(category -> {
                    category
                            .setType(body.getType())
                            .setTitle(body.getTitle())
                            .setUpdatedAt(body.getUpdatedAt())
                            .setUpdatedBy(body.getUpdatedBy());

                    return category;
                })
                .map(updateCategory -> categoryRepository.save(updateCategory))
                .map(category -> response(category))
                .orElseGet(() -> Header.ERROR("데이터 없음"));
    }

    @Override
    public Header delete(Long id) {

        Optional<Category> optional = categoryRepository.findById(id);

        return optional.map(category -> {
            categoryRepository.delete(category);

            return Header.OK();
        }).orElseGet(()->Header.ERROR("데이터 없음"));

    }

    private Header<CategoryApiResponse> response(Category category) {

        CategoryApiResponse categoryApiResponse = CategoryApiResponse.builder()
                .id(category.getId())
                .type(category.getType())
                .title(category.getTitle())
                .createdAt(category.getCreatedAt())
                .createdBy(category.getCreatedBy())
                .updatedAt(category.getUpdatedAt())
                .updatedBy(category.getUpdatedBy())
                .build();

        return Header.OK(categoryApiResponse);

    }

}
