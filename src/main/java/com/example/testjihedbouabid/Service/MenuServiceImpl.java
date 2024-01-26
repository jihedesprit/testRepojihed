package com.example.testjihedbouabid.Service;

import com.example.testjihedbouabid.DAO.Entities.Client;
import com.example.testjihedbouabid.DAO.Entities.Composant;
import com.example.testjihedbouabid.DAO.Entities.Menu;
import com.example.testjihedbouabid.Repository.ClentRepository;
import com.example.testjihedbouabid.Repository.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService{
    ClentRepository clientRepository;
    MenuRepository menuRepository;
    @Override
    public Menu affecterClientAuMenu(String identifiant, String libelleMenu) {
        Client client = clientRepository.findByIdentifiant(identifiant);
        Menu menu = menuRepository.findByLibelleMenu(libelleMenu);

        if (client != null && menu != null) {
            client.getMenuCli().add(menu);
            menu.getClients().add(client);

            clientRepository.save(client);
            menuRepository.save(menu);
        }

        return menu;
    }
}
