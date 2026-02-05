package com.company.portal.controller;

import com.company.portal.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @GetMapping("/invoices")
    public String listInvoices(Model model) {
        model.addAttribute("invoices", service.getAllInvoices());
        return "invoice-list";
    }
}
