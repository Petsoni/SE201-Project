/***********************************************************************
 * Module:  ObservableChat.java
 * Author:  Petar
 * Purpose: Defines the Interface ObservableChat
 ***********************************************************************/

import java.util.*;

/** @pdOid e2d6957e-4a21-48e2-baa9-099880db94d2 */
public interface ObservableChat {
   /** @pdOid 234893c2-e602-4a99-b066-6c4b3a4aa43c */
   void sendMessage();
   /** @pdOid 177fa89c-e2f3-4839-a369-aaa7210d1acb */
   void getMessage();
   /** @pdOid b7b952e2-5f3e-43b5-b373-406bfae0c3e9 */
   void updateMessage();
   /** @pdOid 69ee63fa-3e99-4e7d-b422-ca48dd2e6d14 */
   void deleteMessage();
   /** @pdOid 33b7204d-ed2f-453a-a712-9055636d66d8 */
   void getUserById();

}