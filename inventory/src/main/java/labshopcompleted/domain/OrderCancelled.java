package labshopcompleted.domain;

import labshopcompleted.domain.*;
import labshopcompleted.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}


