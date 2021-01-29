package id.co.bni.otf.bootcamp.repository;

import id.co.bni.otf.bootcamp.entity.ClosingPrice;
import id.co.bni.otf.bootcamp.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.math.BigDecimal;

public interface ClosingPriceRepository  extends JpaRepository<ClosingPrice, Long>, QuerydslPredicateExecutor<ClosingPrice> {
@Query(value = "SELECT max(price) FROM closing_price")
    public BigDecimal max();
}
