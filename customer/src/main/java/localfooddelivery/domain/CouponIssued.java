package localfooddelivery.domain;

import localfooddelivery.domain.*;
import localfooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CouponIssued extends AbstractEvent {

    private Long id;
    private String menu;
    private String address;
    private String orderId;
}


