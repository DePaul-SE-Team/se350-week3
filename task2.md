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
2. Refactor instantiation with injection
3. Before this refactor, why was it impossible to unit test `FilterInvoice.lowValueInvoices()`? What is possible now that wasn't before?
