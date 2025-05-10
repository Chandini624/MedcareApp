
package com.example.MedcareApp.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "database_sequences")
public class
Login {

   private String userName;
   private String password;

   public Login() {
   }

   public Login(String password, String userName) {
      this.password = password;
      this.userName = userName;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassword() {
      return password;
   }

   public String getUserName() {
      return userName;
   }

   @Override
   public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Login login = (Login) o;
      return Objects.equals(userName, login.userName) && Objects.equals(password, login.password);
   }

   @Override
   public int hashCode() {
      return Objects.hash(userName, password);
   }
}
