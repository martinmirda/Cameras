package sk.kas.mirda.Cameras.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CameraLensId implements Serializable {
    private Integer cameraId;
    private Integer lensId;
}
