





# Project Title: Mancala

## How to play 

Mancala is a two-player board game where the objective is to capture more stones than your opponent. The game is played on a board with two rows of six small pits and two larger pits called stores at the ends. Each player controls one side of the board and has their own store. The game begins with four stones in each pit.

Players take turns selecting all the stones from one of their pits and distributing them counterclockwise, placing one stone in each pit they pass, including their own store but skipping their opponent's store. If the last stone lands in the player’s store, they get another turn. If the last stone lands in an empty pit on their side, they capture both the stone and all the stones in the directly opposite pit on the opponent’s side and place them in their store. The game ends when one player has no stones left in their pits. The remaining stones go to the opponent, and the player with the most stones in their store wins.


## Description


This project leverages a range of key object-oriented programming (OOP) concepts that contribute to its overall structure and functionality. Central to the design is the use of encapsulation, where classes like MancalaGame, Board, Pit, and Player encapsulate game logic, player states, and board configurations. Each class manages its own data and behavior, ensuring that changes in one part of the system don't directly affect other parts. Inheritance may be used, particularly in handling different types of pits or exceptions (e.g., PitNotFoundException, InvalidMoveException), allowing for code reuse and a clear hierarchical structure within the game logic.

The project also utilizes polymorphism, especially in its handling of pits and players. This allows for different objects to be processed through a common interface, providing flexibility and simplifying the game's structure. Abstraction plays a role in hiding complex logic, making the game easier to extend or modify without altering the core components. For example, the board and player interactions are abstracted into higher-level classes that manage the flow of the game, while lower-level details remain hidden.

Exception handling is crucial in this project, with custom exceptions like NoSuchPlayerException and InvalidMoveException ensuring that invalid game states are properly handled, making the game more resilient and user-friendly. Additionally, Test-Driven Development (TDD) is employed through the various test files (BoardTest.java, MancalaGameTest.java), reinforcing good coding practices by ensuring that each unit of the game is tested thoroughly.

The project emphasizes code quality and maintenance through the use of Checkstyle, which enforces best practices such as limiting method length, ensuring proper naming conventions, and maintaining a clean, readable codebase. This is critical for large-scale projects, ensuring that the game can be easily understood, maintained, and expanded upon in the future. Overall, the combination of OOP principles, exception handling, TDD, and clean coding practices ensures that this project is robust, scalable, and aligned with professional development standards.

### Dependencies
Install a compiler and assembler to interpret the high-level java code

### Executing program
- Make sure your present working directory is at GP4
- Use command "gradle build"
- Use command "gradle echo" and choose one of two methods to execute the program
- Type one of two methods into the terminal and execute the program
```
gradle build
```
```
gradle echo
```
```
java -jar build/libs/MancalaUI.jar
```





