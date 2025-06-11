# REST API Endpoints Documentation

## 1. GET /api/cameras
**Description:** Get a list of all cameras.

**Response Example:**
```
[
  { "id": 1, "brand": "Canon", "model": "EOS 5D" },
  { "id": 2, "brand": "Nikon", "model": "D850" }
]
```

---

## 2. POST /api/cameras
**Description:** Add a new camera.

**Request Example:**
```
{
  "brand": "Sony",
  "model": "Alpha 7 III"
}
```
**Response Example:**
```
{
  "id": 3,
  "brand": "Sony",
  "model": "Alpha 7 III"
}
```

---

## 3. PUT /api/cameras/{id}
**Description:** Update an existing camera.

**Request Example:**
```
{
  "brand": "Sony",
  "model": "Alpha 7 IV"
}
```
**Response Example:**
```
{
  "id": 3,
  "brand": "Sony",
  "model": "Alpha 7 IV"
}
```

---

## 4. GET /api/cameras/{id}/lenses
**Description:** Get all lenses compatible with a specific camera.

**Response Example:**
```
[
  { "id": 1, "brand": "Canon", "focalLength": "24-70mm", "aperture": "f/2.8" },
  { "id": 2, "brand": "Sigma", "focalLength": "35mm", "aperture": "f/1.4" }
]
```

---

## 5. POST /api/camera-lenses
**Description:** Assign a lens to a camera (create M:N relation).

**Request Example:**
```
{
  "cameraId": 1,
  "lensId": 2
}
```
**Response Example:**
```
{
  "id": 1,
  "camera": { "id": 1, "brand": "Canon", "model": "EOS 5D" },
  "lens": { "id": 2, "brand": "Sigma", "focalLength": "35mm", "aperture": "f/1.4" }
}
```

---

Tieto endpointy pokrývajú základné operácie nad entitami a vzťahmi podľa zadania. V prípade potreby môžem rozšíriť o ďalšie (napr. pre objektívy, príslušenstvo, mazanie väzieb, atď.).

