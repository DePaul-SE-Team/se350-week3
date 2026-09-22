package org.example.part2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterInvoice {
    QueryInvoicesDAO dao;

    public FilterInvoice() {
        this.dao = new QueryInvoicesDAO();
    }
    public List<Invoice> lowValueInvoices() {
            List<Invoice> all = dao.all();

            return all.stream()
                    .filter(invoice -> invoice.getValue() < 100)
                    .collect(toList());
    }
}
