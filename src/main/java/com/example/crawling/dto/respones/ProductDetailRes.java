package com.example.crawling.dto.respones;

import com.example.crawling.domain.Product;
import lombok.Builder;

public class ProductDetailRes {

    private Long productId;
    private String productName;
    private String productImg;
    private String price;
    private String description;
    private String country;
    private String information;

    @Builder
    public ProductDetailRes(Long productId, String productName, String productImg, String price, String description, String country, String information) {
        this.productId = productId;
        this.productName = productName;
        this.productImg = productImg;
        this.price = price;
        this.description = description;
        this.country = country;
        this.information = information;
    }
    public static ProductDetailRes of(Product product){
        return ProductDetailRes.builder()
                .productId(product.getId())
                .productName(product.getProductName())
                .productImg(product.getProductImg())
                .price(product.getPrice())
                .description(product.getDescription())
                .country(product.getCountry())
                .information(product.getInformation()).build();
    }
}

