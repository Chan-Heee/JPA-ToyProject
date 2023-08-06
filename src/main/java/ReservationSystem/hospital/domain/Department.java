package ReservationSystem.hospital.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Department {
    @Id @GeneratedValue
    @Column(name = "department_id")
    private Long id;
    private String name;
    private String number;
    @OneToMany(mappedBy = "department")
    private List<Doctor> doctorList = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}
