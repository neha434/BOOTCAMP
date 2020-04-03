package com.springboot.ecommerceApplication.domain.product;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_REVIEW")
@PrimaryKeyJoinColumn(name = "PRODUCT_ID")
public class ProductReview extends Product {

    private String review;

    private Double rating;      //Double

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_USER_ID",nullable = false)
    private Customers customer;

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
