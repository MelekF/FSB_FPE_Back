package fsb.pfe.project.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Pc")
public class Pc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsalle;

    @Column(name = "PcSalle")
    private String PcSalle;

    @Column(name = "Position")
    private String Position;

    @Column(name = "ReferenceProduit")
    private String ReferenceProduit;

    @Column(name = "Fabricant")
    private String Fabricant;

    @Column(name = "Modele")
    private String Modele;

    @Column(name = "Reference")
    private String Reference;

    @Column(name = "nombreserie")
    private String nombreserie;

    @Column(name = "Logiciels")
    private String Logiciels;

    @Column(name = "NumInventaire")
    private String NumInventaire;

    @Column(name = "CouleurChassis")
    private String CouleurChassis;

    @Column(name = "Cartemere")
    private String Cartemere;

    @Column(name = "Cartemeremodele")
    private String Cartemeremodele;

    @Column(name = "Cartemereslots")
    private String Cartemereslots;

    @Column(name = "Processeur")
    private String Processeur;

    @Column(name = "Processeurtype")
    private String Processeurtype;

    @Column(name = "Processeurfrequence")
    private String Processeurfrequence;

    @Column(name = "Memoire")
    private String Memoire;

    @Column(name = "Memoireinstalle")
    private String Memoireinstalle;

    @Column(name = "Memoiretype")
    private String Memoiretype;

    @Column(name = "Memoirenbrdebarette")
    private String Memoirenbrdebarette;

    @Column(name = "Disquedur")
    private String Disquedur;

    @Column(name = "Disquedurcapacite")
    private String Disquedurcapacite;

    @Column(name = "Disquedurconnectique")
    private String Disquedurconnectique;

    @Column(name = "Disquedurmarque")
    private String Disquedurmarque;

    @Column(name = "Lecteuroptique")
    private String Lecteuroptique;

    @Column(name = "Lecteuroptiquetype")
    private String Lecteuroptiquetype;

    @Column(name = "Cartegraphique")
    private String Cartegraphique;

    @Column(name = "Cartegraphiquetype")
    private String Cartegraphiquetype;

    @Column(name = "Cartegraphiquememoire")
    private String Cartegraphiquememoire;

    @Column(name = "peripherique")
    private String peripherique;

    @Column(name = "peripheriqueclavier")
    private String peripheriqueclavier;

    @Column(name = "peripheriquesouris")
    private String peripheriquesouris;

    @Column(name = "ecran")
    private String ecran;

    @Column(name = "uniteetat")
    private String uniteetat;

    @Column(name = "ecranetat")
    private String ecranetat;

    @Column(name = "ecranfabricant")
    private String ecranfabricant;

    @Column(name = "ecranmodele")
    private String ecranmodele;

    @Column(name = "ecranserienumero")
    private String ecranserienumero;

    @Column(name = "ecrannuminventaire")
    private String ecrannuminventaire;

    @Column(name = "ecrancouleur")
    private String ecrancouleur;

    @Column(name = "ecrantype")
    private String ecrantype;

    @Column(name = "ecrantaille")
    private String ecrantaille;

    @Column(name = "adressphysique")
    private String adressphysique;
}
