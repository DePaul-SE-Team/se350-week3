# SE350 – Week 3: Object Composition in practice!

Three short exercises on object design smells and how to fix them: recognizing tight
coupling from `new`-ing dependencies inside a constructor and refactoring toward
constructor-based dependency injection, then recognizing code that asks an object for its
state instead of telling the object what to do.

- `src/main/java/org/example/part1` — a `Player`/`Weapon` example (see [task1.md](task1.md))
- `src/main/java/org/example/part2` — an invoice/SAP example (see [task2.md](task2.md))
- `src/main/java/org/example/part3` — an `Inventory`/`ShopKeeper` example (see [task3.md](task3.md))

## Setup

Requires Java 25 (If you do not have Java 25, you can try Java version in your system) and Maven (or an IDE with both configured, e.g. IntelliJ via the included
`.idea` project files). Build with:

```
mvn compile
```

Each part has may have an `Entry` class with a `main` method; run that
from your IDE, or `mvn exec:java -Dexec.mainClass=...`, to try out your changes.

## Tasks

Complete all three, in order:

1. [task1.md](task1.md) — warm-up: spot the tight coupling in `Player`/`Weapon`, then refactor it.
2. [task2.md](task2.md) — the same idea in a more realistic codebase: refactor `part2`'s
   invoice pipeline from dependency *instantiation* to dependency *injection*.
3. [task3.md](task3.md) — a different smell: refactor `part3`'s `ShopKeeper` from asking
   `Inventory` about its state and mutating it externally, to telling `Inventory` what
   happened and letting it decide (*Tell, Don't Ask*).
3. [task4.md](task4.md) — remove primitive obssession.
   
