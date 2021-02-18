package com.example.study.service;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.entity.Item;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.ItemApiRequest;
import com.example.study.model.network.response.ItemApiResponse;
import com.example.study.repository.ItemRepository;
import com.example.study.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ItemApiLogicService implements CrudInterface<ItemRepository, ItemRepository> {

    @Autowired
    private PartnerRepository partnerRepository;

    @Override
    private Header<ItemApiResponse> create(Header<ItemApiRequest> request) {

        ItemApiRequest body = request.getData();

        public Header<ItemRepository> create (Header < ItemRepository > request) {

            ItemApiRequest body = request.getData();

            Item item = Item.builder()
                    .status(body.getStatus())
                    .name(body.getName())
                    .title(body.getTitle())
                    .content(body.getContent())
                    .price(body.getPrice())
                    .brandName(body.getBrandName())
                    .registeredAt(LocalDateTime.now())
                    .partner(partnerRepository.getOne(body.getPartnerId()))
                    .build();

            Item newitem = item;

            return null;
        }
    }

    @Override
    public Header<ItemRepository> read(Long id) {
        return null;
    }

    @Override
    public Header<ItemRepository> update(Header<ItemRepository> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
