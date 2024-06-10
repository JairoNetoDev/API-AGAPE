package com.agape.squad6.dto;

import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

public record CobrancaDetailsDTO(Integer cobCodigo,
                              Integer agcCodigo,
                              Integer arrCodigo,
                              Integer recCodigo,
                              Integer exeAno,
                              LocalDate cobDtEmissao,
                              LocalDate cobDtVencimento,
                              BigDecimal cobSubtotal,
                              BigDecimal cobValorTotal,
                              BigDecimal cobValorDesconto,
                              BigDecimal cobValorEntrada,
                              BigDecimal cobValorJuros,
                              BigDecimal cobValorMulta,
                              BigDecimal cobValorCorrecaoMonetaria,
                              BigDecimal cobValorTaxaExpediente,
                              BigDecimal cobTaxaAdicional,
                              BigDecimal cobValorCorrigido,
                              @Size(max = 45) String cobCodigoBarras,
                              @Size(max = 50) String cobCodigoDigitavel,
                              String cobCodigoDigitavelFormatado,
                              @Size(max = 25) String cobNossoNumero,
                              @Size(max = 1) String cobStatus,
                              LocalDate cobDtPagamento,
                              BigDecimal cobValorPago,
                              Integer cotCodigo,
                              Integer usuCodigo,
                              Integer isrCodigo,
                              String cobObservacao,
                              @Size(max = 50) String cobCodigoExportacao,
                              String cobJsonBb) {
}
