package ReservationSystem.hospital.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Patient {
    @Id @GeneratedValue
    @Column(name = "patient_id")
    private Long id;
    private String name;
    int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany (mappedBy = "patient")
    private List<Reservation> reservationList = new ArrayList<>();
}
