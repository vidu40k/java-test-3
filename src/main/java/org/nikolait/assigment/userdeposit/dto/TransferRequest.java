package org.nikolait.assigment.userdeposit.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferRequest {

    @NotNull
    @Positive
    private Long userId;

    @NotNull
    @Positive
    private BigDecimal value;

}
