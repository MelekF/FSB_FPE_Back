package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CarteMere;
import fsb.pfe.project.Repository.CarteMereRepository;

public class CarteMereService {
    @Autowired
    private CarteMereRepository CarteMereRepository;

    // Cree un CarteMere
    public CarteMere CreateCarteMere(CarteMere CarteMere) {
        return CarteMereRepository.save(CarteMere);
    }

    // Cree des CarteMeres
    public List<CarteMere> CreateCarteMeres(List<CarteMere> CarteMere) {
        return CarteMereRepository.saveAll(CarteMere);
    }

    // get CarteMeres

    public List<CarteMere> getCarteMeres() {
        return CarteMereRepository.findAll();
    }

    // get CarteMere By Id
    public CarteMere getCarteMereById(Long idCarteMere) {
        return CarteMereRepository.findById(idCarteMere).orElse(null);
    }

    // Delete CarteMere
    public String DeleteCarteMere(Long idCarteMere) {
        CarteMereRepository.deleteById(idCarteMere);
        return "CarteMere Removed !!" + idCarteMere;
    }

    // UpDate CarteMere
    // public CarteMere UpdateCarteMere(CarteMere CarteMere) {
    // CarteMere existingCarteMere =
    // CarteMereRepository.findById(CarteMere.getIdCarteMere())
    // .orElse(null);
    // existingCarteMere.setCarteMerenom(CarteMere.getCarteMerenom());
    // existingCarteMere.setCarteMereprenom(CarteMere.getCarteMereprenom());
    // existingCarteMere.setCarteMereemail(CarteMere.getCarteMereemail());
    // existingCarteMere.setCarteMeremotdepasse(CarteMere.getCarteMeremotdepasse());
    // existingCarteMere.setCarteMereadress(CarteMere.getCarteMereadress());
    // existingCarteMere.setCarteMerentel(CarteMere.getCarteMerentel());

    // return CarteMereRepository.save(existingCarteMere);
    // }

}
