package in.dminc.models.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Order {

    @EmbeddedId
    private OrderId orderId;

    private String orderInfo;

    @Enumerated
    private OrderStatus orderStatus;

    @Embedded
    private Address address;
}
