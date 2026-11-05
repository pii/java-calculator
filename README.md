# 🧮 Java Calculator

![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![JavaFX](https://img.shields.io/badge/JavaFX-21.0.6-blue)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)

Μια απλή αριθμομηχανή με γραφικό περιβάλλον, γραμμένη σε **Java** με **JavaFX**.
Υποστηρίζει τις βασικές αριθμητικές πράξεις, δεκαδικούς αριθμούς και κρατά
ιστορικό με όλους τους υπολογισμούς.

---
## 🚀 Εκτέλεση

**Linux / macOS**
```bash
sh mvnw clean javafx:run
```

**Windows**
```bat
mvnw.cmd clean javafx:run
```
## 🗂️ Δομή του project

```
src/main/
├── java/
│   ├── module-info.java
│   └── com/calculator/
│       ├── CalculatorApplication.java   # Σημείο εκκίνησης της εφαρμογής
│       ├── CalculatorController.java    # Λογική της αριθμομηχανής και χειρισμός κουμπιών
│       └── operations/
│           ├── Operation.java           # Interface για όλες τις πράξεις
│           ├── Plus.java
│           ├── Subtraction.java
│           ├── Multiplication.java
│           ├── Division.java
│           └── Power.java
└── resources/com/calculator/
    └── calculator.fxml                  # Διάταξη του γραφικού περιβάλλοντος
```
