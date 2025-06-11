package sk.kas.mirda.Cameras.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Camera_Lens")
public class CameraLens {

    @EmbeddedId
    private CameraLensId id;

    @ManyToOne
    @MapsId("cameraId")
    @JoinColumn(name = "camera_id")
    private Camera camera;

    @ManyToOne
    @MapsId("lensId")
    @JoinColumn(name = "lens_id")
    private Lens lens;
}
