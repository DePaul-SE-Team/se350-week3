# Question 1: Creating a `Suit` Enumerated Type

Create a `Suit` enumerated type with the following requirements:

## Requirements

### Part A: Basic Enumeration

Define a `Suit` enum containing the following values:

- `CLUBS`
- `DIAMONDS`
- `SPADES`
- `HEARTS`

### Part B: Nested Enumeration

Modify the `Suit` enum to include a nested enum named `Color`.

The `Color` enum should contain:

- `RED`
- `BLACK`

### Part C: Add `getColor()`

Add a method named `getColor()` to the `Suit` enum that returns a `Color`.

The mappings should be:

| Suit | Color |
|--------|--------|
| CLUBS | BLACK |
| SPADES | BLACK |
| DIAMONDS | RED |
| HEARTS | RED |

### Example Usage

Your `main` method should work as follows:

```java
public static void main(String[] args) {
    Suit suit = Suit.DIAMONDS;
    System.out.println(suit.getColor());
}
```

### Expected Output

```text
RED
```

---

# Question 2: Using Enumerated Types to Remove Primitive Obsession

A Java class named `TwelveDays.java` has been provided.

## Your Task

Refactor the code to take advantage of enumerated types and eliminate primitive obsession.

### Requirements

- Identify places where primitive values (e.g., `int`, `String`) are being used to represent domain concepts.
- Replace those primitive values with appropriate enumerated types.
- Update the implementation to use the new enums wherever appropriate.
- Improve readability and maintainability by making domain concepts explicit through type design.

### Hint

Remember that enums can contain:

- Fields
- Constructors
- Methods

For example:

```java
enum Day {
    FIRST("first"),
    SECOND("second");

    private final String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
```

Use the capabilities of enums to model the concepts in the problem domain rather than relying on primitive values.
