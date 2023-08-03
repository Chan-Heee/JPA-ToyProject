package ReservationSystem.hospital.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Patient {
    @Id @GeneratedValue
    @Column(name = "patient_id")
    private Long id;
    private String name;
    int age;
}
