## FRC Java Project : Animal Zoo

## Getting Started

Clone the ProgrammingProjects-2026 repo from github: WaltonRobotics/ProgrammingProjects-2026
Create a branch for your changes.

## Assignment Overview
An abstract class defines a shared structure for a group of related classes, while leaving some methods for each subclass to implement in its own way. Combined with an interface (a behavior contract classes can opt into) and an enum (a set of related constants), these tools let us model real-world relationships cleanly.
This program models a small zoo using an abstract Animal class, three zoo animals: a Lion, a Penguin, and a Black Bear, a Habitat enum, and a Trainable interface.

## How It Works
The abstract Animal class defines shared traits — name, age, and habitat — along with a constructor.
The Habitat enum represents each animal's environment, and also stores a representative temperature for that environment.
Each animal class extends Animal and provides its own version of makeSound().
The Lion also implements the Trainable interface, since not every animal at the zoo can perform tricks.
The main class creates one of each animal and calls their methods to show how they behave differently.

Assignment: The Habitat Enum
An enum represents a fixed set of related constants — here, the different environments animals at the zoo can live in.
Give each constant a temperature in degrees Fahrenheit by giving the enum its own constructor and field, just like a regular class.
The habitats and related temperatures are:
SAVANNA : 85°F
ARCTIC: -20°F
FOREST: 60°F

Each constant calls the enum's constructor, so SAVANNA always carries a temperature of 85°F.

Assignment: The Abstract Animal Class
An abstract class cannot be instantiated on its own — it can only be extended by subclasses.
It can mix concrete methods (already written, shared by every subclass) with abstract methods (no body — each subclass must provide its own version).
Make instance variables for the name, age, and Habitat (wow that’s the enum!) of the animal and a constructor to initialize those variables.
Create 3 methods: two concrete, a simple getter getName() and a toString() method, and one abstract, makeSound().
makeSound() has no body — every subclass is required to fill it in with its own behavior.

Assignment: The Trainable Interface
An interface is a contract — any class that implements it must provide the methods it lists, regardless of where that class sits in the extends hierarchy.
Create an interface Trainable with one method, performTrick().
Not every animal at the zoo can be trained, so only the classes that need this behavior will implement it.

Assignment: The Lion Class
Lion both extends Animal (it is-a animal) and implements Trainable (it can-do tricks).
Its constructor always passes Habitat.SAVANNA to the Animal constructor, since lions live on the savanna.
Add two unique methods, hunt() and performTrick(), alongside its required makeSound().
Example Output:
Leo lets out a powerful roar!
Leo jumps through a hoop on command.

Assignment: The Penguin Class
Penguin only extends Animal — it does not implement Trainable, since not every animal needs to.
Its constructor passes Habitat.ARCTIC to the Animal constructor.
Add two unique methods, swim() and slide().
Example Output:
Pip lets out a loud honk!
Pip slides across the ice on its belly.

Assignment: The Black Bear Class
BlackBear extends Animal and represents a clear forest animal.
Its constructor passes Habitat.FOREST to the Animal constructor.
Add three unique methods: forage(), climbTree(), and hibernate().
Example Output:
Baloo climbs a tree with surprising speed.

Assignment: Putting It All Together in Main
In AnimalZoo, create one of each animal, then call toString() (inherited from Animal), makeSound() (overridden by each subclass), and each animal's own unique methods.
Only call performTrick() on the class that implements Trainable.

Sample Output #1 – The Lion
Leo (5 years old) lives in the SAVANNA, where it's usually 85°F.
Leo lets out a powerful roar!
Leo stalks silently through the tall grass.
Leo jumps through a hoop on command.

Sample Output #2 – The Black Bear
Baloo (7 years old) lives in the FOREST, where it's usually 60°F.
Baloo lets out a low growl.
Baloo searches the forest floor for berries.
Baloo climbs a tree with surprising speed.

## Submission
Create a PR(Pull Request) on GitHub.
Tell a programming lead
