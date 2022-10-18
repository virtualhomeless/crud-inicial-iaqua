package ideaufro.iAquabackend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "medicion")
public class Medicion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long medId;

    @Column(name = "usuario",nullable = false)
    private String usuario;
    @Column(name = "planta",nullable = false)
    private String planta;
    @Column(name = "usuFechaHora", nullable = false)
    private String fechaHora;
    @Column(name = "medObservacion",nullable = true)
    private String observacion;
    @Column(name = "medEstado",nullable = false)
    private String estado;
    @Column(name = "medCloro",nullable = false)
    private String medCloro;
    @Column(name = "medFluor",nullable = false)
    private String medFluor;
    @Column(name = "medPh",nullable = false)
    private String medPh;
    @Column(name = "medTurbiedad",nullable = true)
    private String medTurbiedad;
    @Column(name = "medMn",nullable = true)
    private String medMn;
    @Column(name = "medFierro",nullable = true)
    private String medFierro;

    public Medicion(String medCloro, String medFluor, String medTurbiedad, String medPh) {
        this.medCloro = medCloro;
        this.medFluor = medFluor;
        this.medPh = medPh;
        this.medTurbiedad = medTurbiedad;
    }
}