package test.app.animal;

import javax.persistence.*;

@Entity(name = "animals")
@Table(schema = "test")
public class Animal {
   @Id
   private Long id;

   private String species;
   
   private String name;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getSpecies() {
      return species;
   }

   public void setSpecies(String species) {
      this.species = species;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
