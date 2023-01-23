/***********************************************************************
 * Module:  Party.java
 * Author:  Petar
 * Purpose: Defines the Class Party
 ***********************************************************************/

import java.util.*;

/** @pdOid 7429ffba-471e-419a-b4af-b9cc29a2193a */
public class Party {
   /** @pdOid 3c992d60-2539-4e11-9564-12918e19f01c */
   private String name;
   /** @pdOid 57019248-cccf-4a8d-adf7-fbc4d9f19703 */
   private String theme;
   /** @pdOid 80fe9478-ce0c-44f4-b02b-1d74f1ec2545 */
   private double ticketPrice;
   /** @pdOid 77e7da2e-c50b-4806-8765-7859d4c6e5e4 */
   private int numberOfReservation;
   /** @pdOid e2ee2a00-80af-4089-91a9-784b9c04b5d8 */
   private int maxReservations;
   
   /** @pdOid 32513753-af60-41c7-9c4d-31382ab5b1ad */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 2aa596cd-42b3-4067-80d5-69795d149246 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 5279d0a7-0e67-43ca-93da-a425ec23833f */
   public String getTheme() {
      return theme;
   }
   
   /** @param newTheme
    * @pdOid e59c7101-ccf0-4350-8534-2d78a5cee39a */
   public void setTheme(String newTheme) {
      theme = newTheme;
   }
   
   /** @pdOid 67a25db8-35f6-4e0e-b7c0-7827c67d4f4a */
   public double getTicketPrice() {
      return ticketPrice;
   }
   
   /** @param newTicketPrice
    * @pdOid 637d753c-5554-4327-a3ba-36f9334e7b2e */
   public void setTicketPrice(double newTicketPrice) {
      ticketPrice = newTicketPrice;
   }
   
   /** @pdOid 4c8fcc45-7d8c-4736-92e6-d0e35828c032 */
   public int getNumberOfReservation() {
      return numberOfReservation;
   }
   
   /** @param newNumberOfReservation
    * @pdOid 79d19472-ab40-4b8e-b134-2423c26bd633 */
   public void setNumberOfReservation(int newNumberOfReservation) {
      numberOfReservation = newNumberOfReservation;
   }
   
   /** @pdOid 7d3e5c7a-b593-43dc-ac7a-fe7afa0697c3 */
   public int getMaxReservations() {
      return maxReservations;
   }
   
   /** @param newMaxReservations
    * @pdOid 2d43b18e-1748-402c-abd4-aa9f7676699e */
   public void setMaxReservations(int newMaxReservations) {
      maxReservations = newMaxReservations;
   }
   
   /** @pdOid 8ec103ed-0c8b-4fdf-85ed-484d44cff9a8 */
   public Party() {
      // TODO: implement
   }

}