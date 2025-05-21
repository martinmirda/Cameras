package sk.kas.mirda.Cameras.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lens")
public class Lens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "focalLength", nullable = false)
    private String focalLength;

    @Column(name = "aperture", nullable = false)
    private String aperture;
}
