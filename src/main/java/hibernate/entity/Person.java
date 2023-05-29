package hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSONS")
public class Person {

    @EmbeddedId
    private PersonPK personPK;
    @Column(name = "phone_number", nullable = false, length = 12)
    private String phoneNumber;
    @Column(name = "city_of_living", nullable = false, length = 50)
    private String cityOfLiving;
}
