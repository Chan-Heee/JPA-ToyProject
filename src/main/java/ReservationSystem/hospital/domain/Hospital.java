package ReservationSystem.hospital.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Hospital {
    @Id
    @GeneratedValue
    @Column(name = "hospital_id")
    private Long id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctorList = new ArrayList<>();

    @OneToMany(mappedBy = "hospital")
    private List<Department> departmentList = new ArrayList<>();
}
