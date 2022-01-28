# Libs

Each lib represents one module and could be seen as a subapp of the client. To define a plublic api for each module a lib can use the esm `export` statement to declare which parts can be called from the outside (see [index.ts]("./../context-a/src/index.ts)).
To get an idea how to structure your code inside a lib have a look at the [Angular Clean Architecture Template]("https://github.com/ovsoftware/clean-architecture-angular-template").