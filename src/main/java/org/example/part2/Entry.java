package org.example.part2;

public class Entry {
    public static void main (String [] args){

        // 1. `SAP_BasedInvoiceSender` does not create its dependencies using
        //    `new FilterInvoice()` or `new SomeSAPImpl()`. Instead, those dependencies
        //    are supplied from outside the class. Explain why this is an example of
        //    dependency injection. Then contrast it with `FilterInvoice` and
        //    `QueryInvoicesDAO`, which instantiate their own dependencies.
        //
        // 2. Refactor `QueryInvoicesDAO` so that a `Database` object is passed into
        //    its constructor instead of being created inside the class.
        //
        // 3. Refactor `FilterInvoice` so that a `QueryInvoicesDAO` object is passed
        //    into its constructor instead of being created inside the class.

    }
}
