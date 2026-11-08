package org.sid.banck_account_service.service;

import jakarta.transaction.Transactional;
import org.sid.banck_account_service.dto.BankAccountRequestDTO;
import org.sid.banck_account_service.dto.BankAccountResponseDTO;
import org.sid.banck_account_service.entities.BankAccount;
import org.sid.banck_account_service.mappers.AccountMapper;
import org.sid.banck_account_service.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount=BankAccount.builder()
                .createdAt(new Date())
                .balance(bankAccountDTO.getBalance())
                .currency(bankAccountDTO.getCurrency())
                .type(bankAccountDTO.getType())
                .build();
       BankAccount saveBankAccount= bankAccountRepository.save(bankAccount);
        return  accountMapper.fromBankAccount(saveBankAccount);

    }

    @Override
    public BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount=BankAccount.builder()
                .createdAt(new Date())
                .balance(bankAccountDTO.getBalance())
                .currency(bankAccountDTO.getCurrency())
                .type(bankAccountDTO.getType())
                .build();
        BankAccount saveBankAccount= bankAccountRepository.save(bankAccount);
        return  accountMapper.fromBankAccount(saveBankAccount);

    }
}
