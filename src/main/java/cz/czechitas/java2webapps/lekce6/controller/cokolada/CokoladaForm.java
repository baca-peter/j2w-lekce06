package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import cz.czechitas.java2webapps.lekce6.controller.alkohol.Objem;

import javax.validation.constraints.*;

public class CokoladaForm {
    @NotBlank
    private String zbozi;
    @NotNull
    private Velkost velkost;
    @NotBlank
    private String jmeno;
    @Email
    @NotNull
    private String email;
    @AssertTrue
    private boolean obchodniPodminky;
    private boolean newsletter;

    public String getZbozi() {
        return zbozi;
    }

    public void setZbozi(String zbozi) {
        this.zbozi = zbozi;
    }

    public Velkost getVelkost() {
        return velkost;
    }

    public void setVelkost(Velkost velkost) {
        this.velkost = velkost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isObchodniPodminky() {
        return obchodniPodminky;
    }

    public void setObchodniPodminky(boolean obchodniPodminky) {
        this.obchodniPodminky = obchodniPodminky;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }
}
