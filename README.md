# Rock Paper Scissors JavaFX

A simple Rock Paper Scissors game built with JavaFX. The user plays against the computer (CPU), and the interface displays the current score for both the player and the CPU.

## Features

- Play Rock, Paper, Scissors against the CPU
- Scores are tracked and displayed for both player and CPU
- Simple, clean JavaFX GUI
- Alerts show the result of each round

## Project Structure

```
src/
├── App.java           # Main application entry point
├── FrontEnd.fxml      # JavaFX UI layout
├── logic.java         # Game logic and FXML controller
└── winner.java        # Winner determination logic
```

## Requirements

- Java 17 or later
- JavaFX SDK (matching your JDK version)
- IDE such as VS Code or IntelliJ IDEA

## How to Run

1. **Clone or download the project.**

2. **Ensure JavaFX is set up in your IDE.**  
   If running from the command line, add JavaFX to your module path.

3. **Compile the project:**

   ```sh
   javac --module-path "path\to\javafx\lib" --add-modules javafx.controls,javafx.fxml src\*.java
   ```

4. **Run the application:**

   ```sh
   java --module-path "path\to\javafx\lib" --add-modules javafx.controls,javafx.fxml -cp src App
   ```

   Replace `"path\to\javafx\lib"` with the path to your JavaFX SDK `lib` directory.

## Notes

- If you encounter errors related to the FXML controller, ensure the class name in `logic.java` matches the `fx:controller` attribute in `FrontEnd.fxml`. Java class names should start with an uppercase letter (`Logic`), so you may want to rename `logic.java` to `Logic.java` and update the FXML accordingly.
- The FXML file and all Java files should be in the same directory or package for this setup.

## License

This project is for educational purposes.

---

**Author:**
Muhammad Ali Akbar
