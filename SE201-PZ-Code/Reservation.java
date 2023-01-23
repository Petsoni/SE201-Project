/***********************************************************************
 * Module:  Reservation.java
 * Author:  Petar
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

import java.util.*;

/** @pdOid 34bba280-6e4b-4dfc-baf4-174c21c475bb */
public class Reservation {
   /** @pdOid a24b1c44-075b-4041-8b61-3c782c5312ca */
   private User user;
   
   /** @pdRoleInfo migr=no name=Party assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Party> party;
   
   /** @pdOid b04fe0f4-2bcf-4ed4-8715-6a83d4dc5f83 */
   public User getUser() {
      return user;
   }
   
   /** @param newUser
    * @pdOid 176bd029-b5c7-4331-bdb9-be64b14abbb2 */
   public void setUser(User newUser) {
      user = newUser;
   }
   
   /** @pdOid fa037025-8811-4158-8ef8-5be47a51688a */
   public Reservation() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Party> getParty() {
      if (party == null)
         party = new java.util.HashSet<Party>();
      return party;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorParty() {
      if (party == null)
         party = new java.util.HashSet<Party>();
      return party.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newParty */
   public void setParty(java.util.Collection<Party> newParty) {
      removeAllParty();
      for (java.util.Iterator iter = newParty.iterator(); iter.hasNext();)
         addParty((Party)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newParty */
   public void addParty(Party newParty) {
      if (newParty == null)
         return;
      if (this.party == null)
         this.party = new java.util.HashSet<Party>();
      if (!this.party.contains(newParty))
         this.party.add(newParty);
   }
   
   /** @pdGenerated default remove
     * @param oldParty */
   public void removeParty(Party oldParty) {
      if (oldParty == null)
         return;
      if (this.party != null)
         if (this.party.contains(oldParty))
            this.party.remove(oldParty);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllParty() {
      if (party != null)
         party.clear();
   }

}