package com.heycoding.springbootdemo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "order_info")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;

    @ManyToOne
    private UserInfo userInfo;

    private double memberDiscount;
    private double gst;
    private double total;
    private String paymentStatus;
    private String urls;

    @OneToMany(mappedBy = "order")
    private List<Item> items;
}
