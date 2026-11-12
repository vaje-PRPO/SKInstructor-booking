# README.md

## SKInstructor - Booking Service

**Domena**
Mikrostoritev skrbi za jedrno poslovno logiko rezervacij terminov smučarskih učiteljev. Preverja zasedenost terminov in upravlja s statusi rezervacij (PENDING, CONFIRMED, CANCELLED). Vsebuje lastno podatkovno bazo za hrambo podatkov o rezervacijah.

**Člani in lastništvo**
* **Lastništvo:** Ekipa za zaledne sisteme (Backend / Booking)
* **Člani:** Tijchy (odgovorna za implementacijo mikrostoritve)

**Build in test (Kako projekt zaženemo?)**
Projekt je zgrajen v Javi (Spring Boot) in uporablja *OpenAPI spec-first* pristop.
1. Generiranje okostja kode in vmesnikov iz `openapi.yaml`:
   ```bash
   mvn clean compile