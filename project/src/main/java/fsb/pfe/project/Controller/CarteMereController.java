package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.CarteMere;
import fsb.pfe.project.service.CarteMereService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CarteMereController {

    private CarteMereService CarteMereService;

    @PostMapping("/addCarteMere")
    public CarteMere CreateCarteMere(@RequestBody CarteMere CarteMere) {
        return CarteMereService.CreateCarteMere(CarteMere);
    }

    // @PostMapping("/addCarteMeres")
    // public List<CarteMere> CreateCarteMeres(@RequestBody List<CarteMere>
    // CarteMere) {
    // return CarteMereService.CreateCarteMeres(CarteMere);
    // }

    @GetMapping("/CarteMeres")
    public List<CarteMere> getCarteMeres() {
        return CarteMereService.getCarteMeres();
    }

    @GetMapping("/CarteMere/{idCarteMere}")
    public CarteMere getCarteMereById(@PathVariable Long idCarteMere) {
        return CarteMereService.getCarteMereById(idCarteMere);
    }

    // @PutMapping("/updateCarteMere")
    // public CarteMere UpdateCarteMere(@RequestBody CarteMere CarteMere) {
    // return CarteMereService.UpdateCarteMere(CarteMere);
    // }

    @DeleteMapping("/delete/{idCarteMere}")
    public String DeleteCarteMere(@PathVariable Long idCarteMere) {
        return CarteMereService.DeleteCarteMere(idCarteMere);
    }

}
