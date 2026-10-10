package org.sid.banck_account_service.service;

import org.sid.banck_account_service.dto.BankAccountRequestDTO;
import org.sid.banck_account_service.dto.BankAccountResponseDTO;


public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
