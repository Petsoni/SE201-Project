/***********************************************************************
 * Module:  Message.java
 * Author:  Petar
 * Purpose: Defines the Class Message
 ***********************************************************************/

import java.util.*;

/** @pdOid a6e4f340-99e1-4cc6-abb3-362721a0adb0 */
public class Message implements ObservableChat {
   /** @pdOid 75848b21-6472-463e-8741-0880298745b2 */
   private User sender;
   /** @pdOid 3852fa7b-eae5-4592-ba51-6d2721224153 */
   private User reciever;
   /** @pdOid bf9e03db-5961-4b86-a2f7-2c11bc2154b8 */
   private String content;
   
   /** @pdRoleInfo migr=no name=ObservableDisplay assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<ObservableDisplay> observableDisplay;
   
   /** @pdOid 6f1b32fb-97c7-4a41-a4ee-0758a2dced1e */
   public User getSender() {
      return sender;
   }
   
   /** @param newSender
    * @pdOid 291c2c4f-81ed-4ed9-acd8-1474a6c46f68 */
   public void setSender(User newSender) {
      sender = newSender;
   }
   
   /** @pdOid 856fa28b-5093-4afe-994d-4c0f87fa80b9 */
   public User getReciever() {
      return reciever;
   }
   
   /** @param newReciever
    * @pdOid 28b3c03e-0285-4561-8f3a-4850363dd351 */
   public void setReciever(User newReciever) {
      reciever = newReciever;
   }
   
   /** @pdOid 643a8545-aa12-4a46-a3fc-df4caa077ddd */
   public String getContent() {
      return content;
   }
   
   /** @param newContent
    * @pdOid 7dc4fb2c-8d08-4836-b345-015d3c1c172d */
   public void setContent(String newContent) {
      content = newContent;
   }
   
   /** @pdOid 2ba01554-1d64-4739-8ba5-f89c2e3416a1 */
   public Message() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ObservableDisplay> getObservableDisplay() {
      if (observableDisplay == null)
         observableDisplay = new java.util.HashSet<ObservableDisplay>();
      return observableDisplay;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorObservableDisplay() {
      if (observableDisplay == null)
         observableDisplay = new java.util.HashSet<ObservableDisplay>();
      return observableDisplay.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newObservableDisplay */
   public void setObservableDisplay(java.util.Collection<ObservableDisplay> newObservableDisplay) {
      removeAllObservableDisplay();
      for (java.util.Iterator iter = newObservableDisplay.iterator(); iter.hasNext();)
         addObservableDisplay((ObservableDisplay)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newObservableDisplay */
   public void addObservableDisplay(ObservableDisplay newObservableDisplay) {
      if (newObservableDisplay == null)
         return;
      if (this.observableDisplay == null)
         this.observableDisplay = new java.util.HashSet<ObservableDisplay>();
      if (!this.observableDisplay.contains(newObservableDisplay))
         this.observableDisplay.add(newObservableDisplay);
   }
   
   /** @pdGenerated default remove
     * @param oldObservableDisplay */
   public void removeObservableDisplay(ObservableDisplay oldObservableDisplay) {
      if (oldObservableDisplay == null)
         return;
      if (this.observableDisplay != null)
         if (this.observableDisplay.contains(oldObservableDisplay))
            this.observableDisplay.remove(oldObservableDisplay);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllObservableDisplay() {
      if (observableDisplay != null)
         observableDisplay.clear();
   }

}