# Monty Hall kata

There is a gameshow hosted by Monty Hall where contestants try to win a big prize, which is behind one of three doors. The contestant begins by choosing a door, but not opening it. Then Monty steps forward and opens one of the other doors. He reveals a goat (!). Then the contestant has the choice of either sticking with the door they have already chosen, or switching to the other unopened door. Whichever door the contestant decides on will be opened, and if they find the prize, they get to keep it. (I’m not sure what happens if they get the second goat!) So what’s the best strategy? Stick or switch?

## ToDo:
- [x] set up Git
- [x] set up Gradle: Jupiter
- [x] 3 doors, prize behind door 1 -> getDoorWithPrize = 1
- [ ] reveal door 2 -> getRevealedDoor = 2
- [ ] choose door 3 -> getChosenDoor = 3
- [ ] isWin -> false
- [ ] switchDoor -> getChosenDoor = 1
- [ ] isWin -> true
- [ ] run test 100 times with random inputs for prizeDoor and chosenDoor
