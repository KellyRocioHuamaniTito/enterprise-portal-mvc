package com.company.portal.repository;

import com.company.portal.model.Invoice;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {

    public List<Invoice> findAll() {
        List<Invoice> invoices = new ArrayList<>();

        invoices.add(new Invoice(1L, "Company A", new BigDecimal("1500.00")));
        invoices.add(new Invoice(2L, "Company B", new BigDecimal("3200.00")));

        return invoices;
    }
}
