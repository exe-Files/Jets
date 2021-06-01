#OOP - Jets Project

### Overview
This program lists a group of Jets, created from a csv file, and lists out the stats of each jet, as well as provide options for the different types. It's meant to provide a better understanding of different classes and interfaces and provide more exposure to these concepts. 

### Technologies Used
- Java 
- Conditionals
- Looping
- Arrays
- Lists
- Classes
- Objects 
- Methods
- Interfaces
- Abstraction

### How to Run
- In order to run, you must be running a version of Java 1.8 or later and a copy of Eclipse. 
- Open Eclipse and import the project
- Run the java JetsApp. This will pull from the other classes within the project. 
- The program will start up and read in the supplied text file
- Once the program is read in, you will be presented with a menu prompt. Choose from the options provided. 
- When you finished, you quit the program with the last option.
- Voila, you're done!

### Lessons Learned
This was a heavy project for me. I realized from the start that I would need to take the time to plan out the program before diving in, just because of the scale of it compared to the previous projects. 
We were provided a UML template that helped guide us in laying out the basic classes, but the rest was essentially up to us. 
I manually drew out the program and tried to connect each piece together, working out what one object does compared to the next. 
Once I had a general idea of how things would work, and how they connected, I began.

Since my last project, I've become much more comfortable with using different non-static methods throughout my main java file. 
I still need to get used to the idea of incorporating those methods into the classes I call though, instead of the monolith of code already in the main program. 
I've also started to realize how much redundant code I tend to use in order to bruteforce a solution, whereas, I could instead write something much more generalized once, and reuse it over and over again, passing arguments to make things specific. 
I'm also gaining a better understanding of Object Oriented Programming, and abstracting things down to a basic template / blueprint.

I definitely spent more time on certain areas than others. One was figuring out how to get the program to instantiate different subclasses of the Jet object. 
I went with breaking apart the csv file, reading in each line, splitting the string into an array, and then using each pieces as arguments for the constructor. 
In order to specify the type however, I needed to add an additional field to the csv file in order to distinguish which jet constructor to use.
Using that field, I could create the object and parse through the rest of the line to fill out the different parameters the constructor needed. 
Once created, I could add each object to an ArrayList as a dynmaic storage solution. 

Another area I spent a lot of time with were the interfaces. 
I understood roughly what they were, but I wasn't sure of how to incorporate them into my program or why I would necessarily use them at all. 
I managed to get them working with the subclasses that implement them, but I feel like I may have overdone some aspcets by trying to define each. 
At mutliple points I got stuck working on the project as a whole. I took some time to review the material from the past week and a half, to make sure I was really comprehending what had been taught the last few days. 
Taking the extra time to review truly helped bring everything back into perspective and solidfy some weaker areas.
I started to get ahead of myself, and started implementing features that I thought were necessary, but I hadn't even met the main requirements yet. 
I needed to readjust my strategy. 
I think one of the best analogies I can think of is programming is a lot like making art. If you don't take the time to visualize what you're making or laying the foundations of a sketch you might still make what you wanted eventually, but not until a lot of erasing and heartache. You'll fix things as you notice mistakes along the way, but if there's too many fixes and adjustments you start to get a bit of a jumbled mess. 
This was a good project, but I definitely would like to take some time to go back and refactor it, adding more input validation and better integration with the subclasses and interfaces. 
