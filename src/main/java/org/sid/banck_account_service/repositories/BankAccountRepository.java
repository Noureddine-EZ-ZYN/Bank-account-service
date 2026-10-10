package org.sid.banck_account_service.repositories;

import org.sid.banck_account_service.entities.BankAccount;
import org.sid.banck_account_service.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
    List<BankAccount>  findByType(AccountType accountType);
}
