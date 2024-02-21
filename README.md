# SER316_RPG
Repository for an RPG that I will be building as a part of SER316

Overview:

This project is a 'dungeon crawler' style RPG that takes its characters from the Pokemon franchise.
Players are able to choose from one of the 3 original starters at the beginning of the game, but in dungeon-crawler fashion they also pick a 'class' for their character.
The 'classes' are secondary traits the pokemon have and they effect how stats are gained upon the pokemon leveling up.
As the pokemon level up they also have the opportunity to evolve which greatly increases their stats and gives them more powerful moves.

In order to beat the game the pokemon must complete 5 gyms.
Each gym is 10 levels with a more powerful pokemon called a 'henchman' at level 5 and the most powerful pokemon in the gym, the 'boss', at level 10.
Each time a pokemon wins a battle they receive a random item, with the rarer items being more powerful.
A pokemon is allowed to have 4 items at a time; a weapon, a shielf, an armor, and an accessory.
If a pokemon receives an item that is more powerful than the item they have equipped they equip the new item instead.

During the course of the adventure a pokemon if a pokemon loses all its health during a battle they must return to the PokeCenter (top floor) 
  where they will be fully healed and have their mana restored.
They also receive a potion at the PokeCenter on each visit. The potion restores 50% of their health when used in battle.
After being healed the Pokemon must repeat the battle that they just lost.
A Pokemon also will go to the PokeCenter if they win a battle but are less than 25% health, or each time they defeat a gym.
The only time that a battle must be restarted is when it is lost.
While at the PokeCenter the Pokemon have the opportunity to level up and evolve.

To beat the game the Pokemon must win every battle including the final boss at level 5-10. The only way they lose the game is if they are
  defeated by the final boss at 5-10.


Design Patterns:

The implementation of this project uses 3 of the Gang of Four design principles.

Abstract Factory:
I needed to create many enemy pokemon in order to populate the gyms and have something for the player to battle against.
In order to do this I used the Abstract Factory pattern. I created a 'GymFactory' that was my abstract factory and then
  I created a class for each gym and they acted as my concrete factories.
I had an abstract class called 'enemy' and abstract classes of 'peon', 'henchman', and 'boss' that inherited functionality from enemy.
I then had classes for each pokemon that extended from peon, henchman, or boss that acted as my 'concrete products'.
Using this design principle allowed me to easily create the pokemon that was necessary at any given point in the game with the same 
  reusable code.
It also allowed the code to just recognize that the variable was 'Enemy' type so I could get functionality from any pokemon I was battling
  using the same code even though they seemed different to me.

Decorator pattern:
One of the more interesting parts of this project for me was learning how to get the Pokemon to evolve.
In order to acheive this I used the Decorator pattern. 
By creating an abstract class 'EvolutionDecorator' that extended from the abstract class 'Player', but also stored a reference to 'Player'
  I could pass through data from the player class to the concrete decorator evolution classes.
I had the concrete evolution classes extend EvolutionDecorator and within them I kept functionality to buff the base class pokemons stats
  as well as give them special moves each evolution.
The 'evolved' decorator classes for each pokemon also contained logic to take a turn in battle with their newfound moves and updated the 
attribute for the pokemones type to reflect its new evolved state e.g. Charizard instead of Charmander.

Facade pattern:
The final design pattern I used was facade.
Due to the complexity of the code to implement the previously discussed design patterns and the many classes needed to populate a game with all
  the players, enemies, items necessary I felt that the actual logic in main needed to be simplified and look clean in order to understand what is
  going on and adhere to good coding principles. 
This led me to my decision to implement the facade pattern.
By creating a facade class and writing methods that grouped subsystems into logical blocks that could be implemented in the main logic and make it 
  easier to read I feel I greatly improved the readability of my code and made it straightforward to read through and understand what was going on.
Without the facade class my main method that drives the game logic would have appeared very disorganized and been difficult to parse through.
The facade class made it so it is just a method to create the player, a loop to 'crawl the dungeons' and a final method to generate a message depending
  on if the player won or lost.

Sources:
I leaned heavily on the website refactoring.guru(https://refactoring.guru/) this website had easy to understand explanations of each of the design patterns
  along with pseudocode and code examples which I found very helpful. They also offered them in Java which is nice, a lot of the examples I found online were
  in other languages so having the option to see the examples in Java made them just a bit more digestible. 
This pavCreations(https://pavcreations.com/decorator-design-pattern-for-dynamic-game-stats/) website I found pretty valuable because it helped me understand how
  design patterns are used in game design. The specificity of their examples and explanations was extremely helpful.
My other big resource was looking up examples of design patterns on GitHub because I find things easier to understand when I have examples instead of just explanations
  and abstractions.
I also frequently referenced StackOverflow whenever I ran into issues to see if anyone else had encountered a similar problem.
I read through the Gang of Fours explanations and UML diagrams of the design patterns often as well.
