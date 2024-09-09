# Guess the Number Game

The "Guess the Number Game" is a simple web application developed to provide an interactive and engaging user experience where players try to guess a randomly generated number by the system. This project serves as a fun yet challenging guessing game, offering users feedback after each guess, and keeping track of their attempts. It was designed to combine frontend design with a Spring Boot backend for handling game logic.

## Tech Stack

**Frontend**:
- HTML
- CSS
- Thymeleaf (for templating)

**Backend**:
- Java
- Spring Boot

**Others**:
- Maven (for project management)

## Features

- **User-Friendly Interface**: The game features an intuitive and responsive design with clear instructions.
- **Number Guessing Logic**: The game generates a random number, and users are prompted to guess until they find the correct number.
- **Attempts Tracking**: The application keeps track of the number of attempts made by the user.
- **Error Handling**: Displays helpful error messages when the guess is invalid.
- **New Game Option**: Users can start a new game at any time to generate a new random number.
- **Responsive Design**: The layout adapts to different screen sizes, ensuring an enjoyable experience on both desktop and mobile devices.
## UI Screenshot
![GameNumberGuess](https://github.com/user-attachments/assets/a76f402b-f3e5-4729-b8d9-4e73455f7235)

## Usage

### Start the Game
1. Enter a number in the input field and click "Submit Guess" to check if your guess is correct.
2. The game will inform you whether your guess is too high or too low.
3. Continue guessing until you find the correct number.

### Start New Game
- Click the "Start New Game" button to reset the game and try again with a new random number.

## API Endpoints

**Submit Guess**  
`POST /my-game/guess`

**New Game**  
`POST /my-game/newgame`

## Installation

### 1. Clone the Repository
```bash
git clone https://github.com/hey-its-d2t2/Guessing-Game.git
cd Guessing-Game
```
### 2. Set Up the Backend
Navigate to the backend directory and run the Spring Boot application:
```bash
cd backend
./mvnw spring-boot:run
```
### 3. Open the Application
Open your browser and visit **http://localhost:8080/guessing-game** to start playing the game.

## Development
To contribute to this project or make modifications, please follow these guidelines:

- Ensure the code adheres to the project standards.
- Include appropriate tests for any new features.
- Submit pull requests with detailed descriptions of changes.
## Acknowledgements
- Spring Boot: For providing a robust backend framework.
- Thymeleaf: For dynamic and efficient templating.
### Contact
For any questions or feedback, please contact me at **deepsinghkumar01@gmail.com**.
