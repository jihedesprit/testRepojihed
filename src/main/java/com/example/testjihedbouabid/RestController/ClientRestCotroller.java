package com.example.testjihedbouabid.RestController;

import com.example.testjihedbouabid.DAO.Entities.Client;
import com.example.testjihedbouabid.Service.ClientServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("client")
public class ClientRestCotroller {
    ClientServiceImpl clientService;
    @PostMapping("addClient")
    public Client addClient( Client c){
        return clientService.ajouterClient(c);
    }
}
