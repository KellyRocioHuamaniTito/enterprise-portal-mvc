package com.company.portal.service;

import com.company.portal.model.Invoice;
import com.company.portal.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository repository = new InvoiceRepository();

    public List<Invoice> getAllInvoices() {
        return repository.findAll();
    }
}
