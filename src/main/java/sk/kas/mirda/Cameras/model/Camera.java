package sk.kas.mirda.Cameras.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "camera")
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @ManyToMany
    @JoinTable(
            name = "camera_lens",
            joinColumns = @JoinColumn(name = "camera_id"),
            inverseJoinColumns = @JoinColumn(name = "lens_id")
    )
    private Set<Lens> lenses = new HashSet<>();

}
