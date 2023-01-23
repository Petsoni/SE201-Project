/***********************************************************************
 * Module:  Dj.java
 * Author:  Petar
 * Purpose: Defines the Class Dj
 ***********************************************************************/

import java.util.*;

/** @pdOid 900cc0ea-4a29-4e5e-a61c-c287372009c9 */
public class Dj extends User {
   /** @pdOid 4991140f-43dc-46a7-88a5-1ece4a748a56 */
   private String artistName;
   
   /** @pdRoleInfo migr=no name=Message assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Message> message;
   
   /** @pdOid 2d74b523-811a-4495-aff0-176dcb5bf10a */
   public String getArtistName() {
      return artistName;
   }
   
   /** @param newArtistName
    * @pdOid 089b7100-9210-4934-b275-646599754efd */
   public void setArtistName(String newArtistName) {
      artistName = newArtistName;
   }
   
   /** @pdOid 459a6fcb-e892-41c0-8214-275b5a4f64f1 */
   public Dj() {
      // TODO: implement
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