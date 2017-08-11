package me.kikorose.demo.models;

public class Experience {

    private long id;
    private String skilled;
    private String profient;
    private String familiar;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSkilled() {
        return skilled;
    }

    public void setSkilled(String skilled) {
        this.skilled = skilled;
    }

    public String getProfient() {
        return profient;
    }

    public void setProfient(String profient) {
        this.profient = profient;
    }

    public String getFamiliar() {
        return familiar;
    }

    public void setFamiliar(String familiar) {
        this.familiar = familiar;
    }
}