package pharmacie.dao;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pharmacie.entity.Commande; // Import indispensable

// Utiliser <Commande, Integer> et non <CommandeRepository, Integer>
public interface CommandeRepository extends JpaRepository<Commande, Integer> {

    // La méthode doit retourner une liste d'entités Commande
    List<Commande> findBySaisieLeAfter(LocalDate date);
}