CREATE TABLE Camera (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        brand VARCHAR(50) NOT NULL,
                        model VARCHAR(50) NOT NULL
);

CREATE TABLE Lens (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      brand VARCHAR(50) NOT NULL,
                      focalLength VARCHAR(20) NOT NULL,
                      aperture VARCHAR(10) NOT NULL
);

CREATE TABLE Camera_Lens (
                             camera_id INT NOT NULL,
                             lens_id INT NOT NULL,
                             PRIMARY KEY (camera_id, lens_id),
                             FOREIGN KEY (camera_id) REFERENCES Camera(id),
                             FOREIGN KEY (lens_id) REFERENCES Lens(id)
);

CREATE TABLE Accessory (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           name VARCHAR(100) NOT NULL,
                           type VARCHAR(50) NOT NULL
);

CREATE TABLE Camera_Accessory (
                                  camera_id INT NOT NULL,
                                  accessory_id INT NOT NULL,
                                  PRIMARY KEY (camera_id, accessory_id),
                                  FOREIGN KEY (camera_id) REFERENCES Camera(id),
                                  FOREIGN KEY (accessory_id) REFERENCES Accessory(id)
);

INSERT INTO Camera (brand, model) VALUES
                                      ('Canon', 'EOS R5'),
                                      ('Canon', 'EOS R6'),
                                      ('Sony', 'A7 IV'),
                                      ('Sony', 'A7 III'),
                                      ('Nikon', 'Z9'),
                                      ('Fujifilm', 'X-T5');

INSERT INTO Lens (brand, focalLength, aperture) VALUES
                                                    ('Canon', '24-70mm', 'f/2.8'),
                                                    ('Canon', '70-200mm', 'f/2.8'),
                                                    ('Sony', '50mm', 'f/1.4'),
                                                    ('Tamron', '17-28mm', 'f/2.8'),
                                                    ('Sigma', '35mm', 'f/1.4'),
                                                    ('Nikon', '24-120mm', 'f/4');

INSERT INTO Camera_Lens (camera_id, lens_id) VALUES
                                                 (1, 1),
                                                 (1, 2),
                                                 (2, 1),
                                                 (3, 3),
                                                 (3, 4),
                                                 (4, 4),
                                                 (4, 5),
                                                 (5, 6),
                                                 (6, 5);

INSERT INTO Accessory (name, type) VALUES
                                       ('Tripod', 'Tripod'),
                                       ('External Flash', 'Flash'),
                                       ('Camera Bag', 'Bag'),
                                       ('Memory Card', 'Storage'),
                                       ('Lens Cleaning Kit', 'Maintenance'),
                                       ('ND Filter', 'Filter');

INSERT INTO Camera_Accessory (camera_id, accessory_id) VALUES
                                                           (1, 1),
                                                           (1, 2),
                                                           (2, 3),
                                                           (3, 4),
                                                           (3, 5),
                                                           (4, 6),
                                                           (5, 1),
                                                           (5, 2),
                                                           (6, 3);

SELECT * FROM Camera;
SELECT * FROM Lens;
SELECT * FROM Accessory;

SELECT Camera.brand, Camera.model, Lens.brand, Lens.focalLength, Lens.aperture
FROM Camera_Lens
         JOIN Camera ON Camera_Lens.camera_id = Camera.id
         JOIN Lens ON Camera_Lens.lens_id = Lens.id;

SELECT Camera.brand, Camera.model, Accessory.name, Accessory.type
FROM Camera_Accessory
         JOIN Camera ON Camera_Accessory.camera_id = Camera.id
         JOIN Accessory ON Camera_Accessory.accessory_id = Accessory.id;

