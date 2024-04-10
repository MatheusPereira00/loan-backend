package com.matheus.emprestimo.app.dto;

import com.matheus.emprestimo.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
