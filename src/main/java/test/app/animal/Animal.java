package test.app.animal;

import javax.persistence.*;

@Entity(name = "animals")
@Table(schema = "test")
public class Animal {
   @Id
   private Long id;

   private String species;
   
   private String name;
}
