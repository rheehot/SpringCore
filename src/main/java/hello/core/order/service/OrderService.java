package hello.core.order.service;

import hello.core.order.model.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
