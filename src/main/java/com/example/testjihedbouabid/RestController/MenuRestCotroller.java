package com.example.testjihedbouabid.RestController;

import com.example.testjihedbouabid.DAO.Entities.Menu;
import com.example.testjihedbouabid.Service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MenuRestCotroller {
    MenuService menuService;

    @PostMapping("/affecterClientAuMenu/{identifiant}/{libelleMenu}")
    public Menu affecter(@PathVariable String identifiant, @PathVariable String libelleMenu) {
        return menuService.affecterClientAuMenu(identifiant, libelleMenu);
    }
}
