/***********************************************************************
 * Module:  Menager.java
 * Author:  Petar
 * Purpose: Defines the Class Menager
 ***********************************************************************/

import java.util.*;

/** @pdOid 3c270236-05ca-4cb7-88bb-605386b578ba */
public class Menager extends User {
   /** @pdOid fc5d371e-5858-42b6-9432-6045f373331a */
   private String privateCode;
   
   /** @pdRoleInfo migr=no name=Club assc=association6 coll=java.util.List impl=java.util.ArrayList mult=1..* type=Aggregation */
   public java.util.List<Club> club;
   /** @pdRoleInfo migr=no name=Message assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Message> message;
   
   /** @pdOid 900ae150-7a77-47d7-b41b-e18e5daa7192 */
   public String getPrivateCode() {
      return privateCode;
   }
   
   /** @param newPrivateCode
    * @pdOid 4eadf3ba-03b8-4529-b8f4-ca38c9a20b4f */
   public void setPrivateCode(String newPrivateCode) {
      privateCode = newPrivateCode;
   }
   
   /** @pdOid 114610e7-5e6b-4145-8c90-6b4eb88cfafa */
   public Menager() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Club> getClub() {
      if (club == null)
         club = new java.util.ArrayList<Club>();
      return club;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorClub() {
      if (club == null)
         club = new java.util.ArrayList<Club>();
      return club.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newClub */
   public void setClub(java.util.List<Club> newClub) {
      removeAllClub();
      for (java.util.Iterator iter = newClub.iterator(); iter.hasNext();)
         addClub((Club)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newClub */
   public void addClub(Club newClub) {
      if (newClub == null)
         return;
      if (this.club == null)
         this.club = new java.util.ArrayList<Club>();
      if (!this.club.contains(newClub))
         this.club.add(newClub);
   }
   
   /** @pdGenerated default remove
     * @param oldClub */
   public void removeClub(Club oldClub) {
      if (oldClub == null)
         return;
      if (this.club != null)
         if (this.club.contains(oldClub))
            this.club.remove(oldClub);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllClub() {
      if (club != null)
         club.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Message> getMessage() {
      if (message == null)
         message = new java.util.HashSet<Message>();
      return message;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMessage() {
      if (message == null)
         message = new java.util.HashSet<Message>();
      return message.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMessage */
   public void setMessage(java.util.Collection<Message> newMessage) {
      removeAllMessage();
      for (java.util.Iterator iter = newMessage.iterator(); iter.hasNext();)
         addMessage((Message)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMessage */
   public void addMessage(Message newMessage) {
      if (newMessage == null)
         return;
      if (this.message == null)
         this.message = new java.util.HashSet<Message>();
      if (!this.message.contains(newMessage))
         this.message.add(newMessage);
   }
   
   /** @pdGenerated default remove
     * @param oldMessage */
   public void removeMessage(Message oldMessage) {
      if (oldMessage == null)
         return;
      if (this.message != null)
         if (this.message.contains(oldMessage))
            this.message.remove(oldMessage);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMessage() {
      if (message != null)
         message.clear();
   }

}