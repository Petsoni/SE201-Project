/***********************************************************************
 * Module:  User.java
 * Author:  Petar
 * Purpose: Defines the Class User
 ***********************************************************************/

/**
 * @pdOid a38dce3b-e996-4ec0-8ac8-bdb53bbc17d4
 */
public class User {
    /**
     * @pdOid ff65b196-b568-4ec7-9227-a0bb2788c707
     */
    private String username;
    /**
     * @pdOid 1ad8b0a9-03f8-4515-8b6b-41787cedc51c
     */
    private String password;

    /**
     * @pdOid 66e9b4a6-72f6-4736-af7f-2c745250530f
     */
    public User() {
        // TODO: implement
    }

    /**
     * @pdOid ef16e3be-87d8-42b2-8a46-2fd0f7b620fd
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param newUsername
     * @pdOid e9039cc6-5ed4-4815-a216-c3379ac3f0eb
     */
    public void setUsername(String newUsername) {
        username = newUsername;
    }

    /**
     * @pdOid 49a715d9-097b-4a87-92de-3e82c6093519
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param newPassword
     * @pdOid 654a7fd3-3414-48c1-9e0c-bccf3cced252
     */
    public void setPassword(String newPassword) {
        password = newPassword;
    }

}