package br.senai.repository;

import br.senai.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Cliente findByCpf(String cpf);
    public Cliente findByEmail(String email);
    public Cliente findByNome(String nome);
    public Cliente findByNomeAndEmailAndCpf(String cpf,String email, String nome);
}
