package pl.project.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.calculator.exchanger.NbpExchangeRateDownloader;
import pl.project.calculator.exchanger.NbpExchangeRateResult;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class CurrencyExchangeService {

    private final NbpExchangeRateDownloader nbpExchangeRateDownloader;

    @Autowired
    public CurrencyExchangeService(NbpExchangeRateDownloader nbpExchangeRateDownloader) {
        this.nbpExchangeRateDownloader = nbpExchangeRateDownloader;
    }

    public NbpExchangeRateResult calculate(BigDecimal value, LocalDate exchangeDate, String code) {
        nbpExchangeRateDownloader.downloadExchangeRate(code,exchangeDate);


        nbpExchangeRateDownloader.downloadExchangeRate(exchangeDate,code,);

if(tak){
   // zwracamy obiekt exhange result
} else {
   // zwracamy erroe ze nie udało sie
}

        return null;
    }


}
