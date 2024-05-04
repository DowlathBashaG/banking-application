package io.dowlath.banking.application.repository;

import io.dowlath.banking.application.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
