package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.Stock;
import fsb.pfe.project.service.StockService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StockController {
    @Autowired

    private StockService StockService;

    @PostMapping("/addStock")
    public Stock CreateStock(@RequestBody Stock Stock) {
        return StockService.CreateStock(Stock);
    }

    @PostMapping("/addStocks")
    public List<Stock> CreateStocks(@RequestBody List<Stock> Stock) {
        return StockService.CreateStocks(Stock);
    }

    @GetMapping("/Stocks")
    public List<Stock> getStocks() {
        return StockService.getStocks();

    }

    @GetMapping("/Stock/{idStock}")
    public Stock getStockById(@PathVariable Long idStock) {
        return StockService.getStockById(idStock);
    }

    // @PutMapping("/updateStock")
    // public Stock UpdateStock(@RequestBody Stock Stock) {
    // return StockService.UpdateStock(Stock);
    // }/////////////////////////////////////////////////////////////////////////
    // @PutMapping("/updateStock/{idStock}")
    // public Stock UpdateStock(@RequestBody Long idStock,
    // Stock Stock) {
    // return StockService.UpdateStock(idStock, Stock);
    // }

    // @PutMapping("/updateStock/{idStock}")
    // public ResponseEntity<Stock> UpdateStock(@PathVariable("idStock") Long
    // idStock,
    // @RequestBody Stock Stock) {
    // Stock UpdateStock = StockService.UpdateStock(idStock, Stock);
    // return ResponseEntity.ok(UpdateStock);
    // }

    @DeleteMapping("/deleteStock/{idStock}")
    public String DeleteStock(@PathVariable Long idStock) {
        return StockService.DeleteStock(idStock);
    }

}
