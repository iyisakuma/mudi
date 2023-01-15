package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        Produto produto = new Produto();
        produto.setNome("Hetero Top - Judeu version");
        produto.setDataEntrega(LocalDate.now());
        produto.setDescricao("últimas unidades..\n" +
                "heterto top com a skin de pijama listrada. Aproveite, pois o " +
                "produto em questão está com câncer.");
        produto.setValor(new BigDecimal("9.99"));
        produto.setUrl("https://www.xvideos.com/c/m:today/Gay-45");
        produto.setUrlImg("maumau.jpeg");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        model.addAttribute("produtos", produtos);
        return "home";
    }
}
