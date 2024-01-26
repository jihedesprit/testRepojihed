package com.example.testjihedbouabid.Service;

import com.example.testjihedbouabid.DAO.Entities.Client;
import com.example.testjihedbouabid.Repository.ClentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService{
    private ClentRepository clientRepository;
    @Override
    public Client ajouterClient(Client client) {
        return  clientRepository.save(client);
    }
}
