package id.co.bni.otf.bootcamp.service;

import id.co.bni.otf.bootcamp.entity.ClosingPrice;
import id.co.bni.otf.bootcamp.entity.QStocks;
import id.co.bni.otf.bootcamp.entity.Stocks;
import id.co.bni.otf.bootcamp.repository.ClosingPriceRepository;
import id.co.bni.otf.bootcamp.service.dto.ClosingPriceDTO;
import id.co.bni.otf.bootcamp.service.dto.StocksDTO;
import id.co.bni.otf.bootcamp.service.mapper.ClosingPriceMapper;
import id.co.bni.otf.bootcamp.validation.contract.OnCreate;
import id.co.bni.otf.bootcamp.web.exception.DataNotUniqueException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
@Transactional
public class ClosingPricesService {
    private static final Logger LOG = LoggerFactory.getLogger(ClosingPricesService.class);
    private final ClosingPriceRepository closingPriceRepository;
    private final ClosingPriceMapper closingPriceMapper;

    public ClosingPricesService(ClosingPriceRepository closingPriceRepository, ClosingPriceMapper closingPriceMapper) {
        this.closingPriceRepository = closingPriceRepository;
        this.closingPriceMapper = closingPriceMapper;
    }

}
