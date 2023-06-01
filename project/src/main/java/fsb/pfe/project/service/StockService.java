package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import fsb.pfe.project.Model.Stock;
import fsb.pfe.project.Repository.StockRepository;

@Service

public class StockService {
    @Autowired
    private StockRepository StockRepository;

    // Cree un Stock
    public Stock CreateStock(Stock Stock) {
        return StockRepository.save(Stock);
    }

    // Cree des Stocks
    public List<Stock> CreateStocks(List<Stock> Stock) {
        return StockRepository.saveAll(Stock);
    }

    // get Stocks

    public List<Stock> getStocks() {
        return StockRepository.findAll();
    }

    // get Stock By Id
    public Stock getStockById(Long idStock) {
        return StockRepository.findById(idStock).orElse(null);
    }

    // Delete Stock
    public String DeleteStock(Long idStock) {
        StockRepository.deleteById(idStock);
        return "Stock Removed !!" + idStock;
    }

    // UpDate Stock
    // public Stock UpdateStock(Stock Stock) {
    // Stock existingStock =
    // StockRepository.findById(Stock.getIdStock())
    // .orElse(null);
    // existingStock.setStocknom(Stock.getStocknom());
    // existingStock.setStocktel(Stock.getStocktel());
    // existingStock.setStockemail(Stock.getStockemail());
    // existingStock.setStockncin(Stock.getStockncin());
    // existingStock.setStocktype(Stock.getStocktype());
    // existingStock.setStocksalle(Stock.getStocksalle());
    // existingStock.setStockmateriel(Stock.getStockmateriel());
    // existingStock.setStockdate(Stock.getStockdate());
    // existingStock.setStockheure(Stock.getStockheure());

    // return StockRepository.save(existingStock);
    // }////////////////////////////////////////////////////////////////////////////////////////////
    // public Stock UpdateStock(Long IdStock, Stock Stock) {
    // Stock existingStock = StockRepository.findById(IdStock).orElse(null);
    // if (existingStock == null) {
    // throw new ResourceNotFoundException("Stock not found with id: " + IdStock);
    // }
    // existingStock.setStocknom(Stock.getStocknom());
    // existingStock.setStocktel(Stock.getStocktel());
    // existingStock.setStockemail(Stock.getStockemail());
    // existingStock.setStockncin(Stock.getStockncin());
    // existingStock.setStocktype(Stock.getStocktype());
    // existingStock.setStocksalle(Stock.getStocksalle());
    // existingStock.setStockmateriel(Stock.getStockmateriel());
    // existingStock.setStockdate(Stock.getStockdate());
    // existingStock.setStockheure(Stock.getStockheure());

    // return StockRepository.save(existingStock);
    // }

    // public Stock updateStock(Long idStock, Stock
    // Stock) {
    // Stock.setIdStock(idStock);
    // return StockRepository.save(Stock);
    // }
}
