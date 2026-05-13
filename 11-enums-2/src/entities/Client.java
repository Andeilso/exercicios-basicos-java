package entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(){
    }

    public Client(String name, String email, LocalDate birthDate){
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getBirthDate(){
        return this.birthDate;
    }
}
