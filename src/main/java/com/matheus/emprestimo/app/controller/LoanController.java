package com.matheus.emprestimo.app.controller;

import com.matheus.emprestimo.app.dto.CustomerLoanRequest;
import com.matheus.emprestimo.app.dto.CustomerLoanResponse;
import com.matheus.emprestimo.app.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:64748")
@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody @Validated CustomerLoanRequest loanRequest) {
        var loanResponse = loanService.checkLoanAvailability(loanRequest);
        return ResponseEntity.ok(loanResponse);
    }
}
