# SER316_RPG
Repository for an RPG that I will be building as a part of SER316

Abstract Factory Pattern - build monsters
Decorator Pattern - Level up/evolve/gain skills
Mediator Pattern - control game logic

I am planning to create an RPG in the style of pokemon where the player is a codeymon and each 'cycle' is a codeymon gym.
I will use the Abstract Factory design pattern to generate the codeymon, both the codeymon controlled by the player and the codeymon that they're fighting, this will fulfill the requirements for fighting small, medium, and BOSS enemies as well as making enemies harder as the floors get harder and generating stats for characters/enemies. I will use the decorator pattern to equip items, deal with evolutions, pick the class and type of character at the beginning, etc. I will use the mediator pattern in order to make sure the simulation is tick based and runs in the correct order.