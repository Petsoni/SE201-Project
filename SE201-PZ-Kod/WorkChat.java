/***********************************************************************
 * Module:  WorkChat.java
 * Author:  Petar
 * Purpose: Defines the Class WorkChat
 ***********************************************************************/

import java.util.List;

/**
 * @pdOid 4d1d7975-d7da-4300-a05a-ab20a1f80248
 */
public class WorkChat extends ObservableDisplay {
    /**
     * @pdOid 7812b37f-7d25-420b-89f6-dca70de35ac7
     */
    private List<Message> messages;
    /**
     * @pdOid c95dd4bf-3a9f-45ae-a0e5-b487e9f3e617
     */
    private List<User> users;

    /**
     * @pdOid 706f8ab8-e922-4e60-a167-fb891e85d0ee
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * @param newMessages
     * @pdOid 823dbed3-6efe-4c2d-99aa-a4bba084f529
     */
    public void setMessages(List<Message> newMessages) {
        messages = newMessages;
    }

    /**
     * @pdOid 4b1fad31-8cfb-4c20-8760-c69bb5fbc8d1
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * @param newUsers
     * @pdOid c07de063-2b4f-430e-aa6a-9a2958f2603b
     */
    public void setUsers(List<User> newUsers) {
        users = newUsers;
    }

}