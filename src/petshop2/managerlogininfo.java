/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop2;

public class managerlogininfo {
    private static final String[] usernames = {"admin1", "admin2","admin3"};
    private static final String[] passwords = {"12345", "12345","9999"};
    
    public boolean validateLogin(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
