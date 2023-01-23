/***********************************************************************
 * Module:  Connection.java
 * Author:  Petar
 * Purpose: Defines the Class Connection
 ***********************************************************************/

import java.util.*;

/** @pdOid d192ec6b-1044-4d15-bfd1-8ee3b79c821a */
public class Connection {
   /** @pdOid 22b0cbc0-6f65-432b-9db0-0c13b9b3d32f */
   private Connection connection;
   
   /** @pdOid a6678f07-f637-48d1-b808-d536d3bf3b75 */
   private Connection() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Connection assc=association2 mult=0..1 */
   public Connection connectionB;
   
   /** @pdOid 645d2aeb-c57e-45f3-a2bf-7ba5158f3fac */
   public Connection getConnection() {
      // TODO: implement
      return null;
   }

}