package pharmacie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdressePostale {

    @Column(name = "ADRESSE", length = 60)
    @Size(max = 60)
    private String rue;

    @Column(name = "CODE_POSTAL", length = 10)
    @Size(max = 10)
    private String codePostal;

    @Column(length = 15)
    @Size(max = 15)
    private String ville;

    @Column(length = 15)
    @Size(max = 15)
    private String pays;

    @Column(length = 15)
    @Size(max = 15)
    private String region;
}