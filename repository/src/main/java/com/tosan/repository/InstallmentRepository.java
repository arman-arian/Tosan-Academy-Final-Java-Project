package com.tosan.repository;

import com.tosan.model.Installment;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface InstallmentRepository extends BaseRepository<Installment, Long> {
    List<Installment> findByLoanIdOrderByInstallmentNo(Long LoanId);

    List<Installment> findByLoanIdAndPaidOrderByInstallmentNo(Long loanId, Boolean paid, Pageable pageable);

    default List<Installment> findTopCountByLoanIdAndPaidOrderByInstallmentNo(Long loanId, Boolean paid, Integer count) {
        return findByLoanIdAndPaidOrderByInstallmentNo(loanId, paid, PageRequest.of(0, count));
    }

    @Query(value = "SELECT sum(i.interestAmount) FROM Installment i WHERE i.paid = true AND i.paidDate > ?1 AND i.paidDate < ?2")
    BigDecimal getTotalInterest(LocalDateTime fromDateTime, LocalDateTime toDateTime);
}

