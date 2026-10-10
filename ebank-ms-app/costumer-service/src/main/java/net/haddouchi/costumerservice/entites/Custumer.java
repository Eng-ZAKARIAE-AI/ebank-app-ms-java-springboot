package net.haddouchi.costumerservice.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Custumer {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
