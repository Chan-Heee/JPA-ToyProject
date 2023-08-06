package ReservationSystem.hospital.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Doctor {
    @Id
    @GeneratedValue
    @Column(name = "doctor_id")
    private Long id;
    private String name;
    private int career;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @OneToMany(mappedBy = "doctor")
    private List<Reservation> reservationList =new ArrayList<>();
}

