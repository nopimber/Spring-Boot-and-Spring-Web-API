package ku.cs.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data // ไม่ต้องทำ getter setter
@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private UUID id; //universal unique identifier (UUID)

    private String name;
    private double rating;
    private String location;
    private String type;
}
