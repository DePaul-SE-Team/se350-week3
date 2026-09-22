## Dependency Injection Practice

### Starter code is under part 2 package (`org.example.part2`)

```java
public class QueryInvoicesDAO {
    private Database connection;

    public QueryInvoicesDAO() {
        this.connection = new Database();
    }
    // ...
}

public class FilterInvoice {
    QueryInvoicesDAO dao;

    public FilterInvoice() {
        this.dao = new QueryInvoicesDAO();
    }
    // ...
}
```

Compare that to `SAP_BasedInvoiceSender`, which is already written the way we want:

```java
public class SAP_BasedInvoiceSender {
    private final FilterInvoice filter;
    private final SAP sap;

    public SAP_BasedInvoiceSender(FilterInvoice filter, SAP sap) {
        this.filter = filter;
        this.sap = sap;
    }
    // ...
}
```

### Tasks

1. Find every class in `part2` that builds its own dependency with `new` inside its constructor instead of receiving it as a parameter. List them.
2. `SAP_BasedInvoiceSender` never calls `new FilterInvoice()` or `new SomeSAPImpl()`. Why is this already an example of dependency **injection**, while `FilterInvoice` and `QueryInvoicesDAO` are examples of dependency **instantiation**?
3. Refactor `QueryInvoicesDAO` so it receives its `Database` through the constructor instead of creating one itself.
4. Refactor `FilterInvoice` so it receives its `QueryInvoicesDAO` through the constructor instead of creating one itself.
5. Now that nothing wires itself up automatically, something has to build the full object graph by hand. Create an `Entry.java` in `part2` that constructs, in order: `Database` → `QueryInvoicesDAO` → `FilterInvoice` → an `SAP` implementation → `SAP_BasedInvoiceSender`, then calls `sendLowValuedInvoices()`. (This single method is the composition root — the one place `new` is still allowed.)
6. Before this refactor, why was it impossible to unit test `FilterInvoice.lowValueInvoices()` without a real database connection? What is possible now that wasn't before?
7. `SAP` is an interface but `Database` is a concrete class. Does dependency injection require the dependency to be an interface? What testing benefit do you get either way once it's passed into the constructor?
