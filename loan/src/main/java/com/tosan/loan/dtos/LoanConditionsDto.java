package com.tosan.loan.dtos;

import com.tosan.dtos.BaseDto;
import com.tosan.model.Currencies;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoanConditionsDto extends BaseDto {
    private Long id;
    private BigDecimal interestRate;
    private Integer minRefundDuration;
    private Integer maxRefundDuration;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private LocalDateTime startDate;
    private LocalDateTime expireDate;
    private Currencies currency;
}
