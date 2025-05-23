package com.devsuperior.crud.services;

import com.devsuperior.crud.dto.ClientDTO;
import com.devsuperior.crud.entities.Client;
import com.devsuperior.crud.repositories.ClientRepository;
import com.devsuperior.crud.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {

        Client client = clientRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cliente não encontrado!"));

        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = clientRepository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }

    @Transactional
    public ClientDTO insert(ClientDTO clientDTO) {
        Client client = new Client();
        copyDtoToEntity(clientDTO, client);
        Client saved = clientRepository.save(client);
        return new ClientDTO(saved);
    }


    @Transactional
    public ClientDTO update(Long id, ClientDTO clientDTO) {

        try {
            Client client = clientRepository.getReferenceById(id);
            copyDtoToEntity(clientDTO, client);
            Client saved = clientRepository.save(client);
            return new ClientDTO(saved);

        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Recurso não encontrado para alterado");
        }

    }


    @Transactional
    public void delete(Long id) {
        if(!clientRepository.existsById(id)) {
            throw new ResourceNotFoundException("Cliente não encontrado para excluir");
        }
        clientRepository.deleteById(id);

    }

    private void copyDtoToEntity(ClientDTO clientDTO, Client client) {

        client.setName(clientDTO.getName());
        client.setBirthDate(clientDTO.getBirthDate());
        client.setChildren(clientDTO.getChildren());
        client.setCpf(clientDTO.getCpf());
        client.setIncome(clientDTO.getIncome());

    }

}
