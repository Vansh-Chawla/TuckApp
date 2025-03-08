package Backend;



import Backend.DB_INFO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class C_Users {


    Connection connection;
    
    private Integer id;
    private String name;
    private String email;
    private String user_type;
    private String phone;
   

    
   public C_Users(){}
    
    
    public C_Users(Integer ID, String NAM, String EMAIL,String UTYP, String PHONE)
    {
        this.id = ID;
        this.name = NAM;
        this.email = EMAIL;
        this.phone = PHONE;
        this.user_type = UTYP;
       
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    



   
    
    // get users list
    public ArrayList<C_Users> UsersList(){
        
        ArrayList<C_Users> user_list = new ArrayList<>();
        connection = DB_INFO.getConnection();

        ResultSet rs;
        PreparedStatement ps;

               String query = "SELECT `id`, `name`, `email`, `user_type`, `phone` FROM `users` WHERE `user_type` = 'user'";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
           
            C_Users user;
            while(rs.next()){
                user = new C_Users(rs.getInt("id"), 
                                 rs.getString("name"),
                                 rs.getString("email"),
                                 rs.getString("user_type"),
                                 rs.getString("phone")
                                
                                 );
                user_list.add(user);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(C_Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user_list;
        
    }
    
    
    
    
    // insert a new user
     public static void insertUser(C_Users user)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `users`(`name`, `email`, `user_type`, `phone`) VALUES (?,?,?,?)");

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, "user");// the admin will add a user
            ps.setString(4, user.getPhone());
         
            

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "New User Added");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(C_Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     // update user
    public static void updateUser(C_Users user)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("UPDATE `users` SET `name`=?,`email`=?,`phone`=? WHERE `id`=?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhone());
           
            ps.setInt(4, user.getId());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "User Updated");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(C_Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    // delete user
    public static void deleteUser(Integer userId)
    {
        
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `users` WHERE `id` = ?");

            ps.setInt(1, userId);

            // show a confirmation message before deleting the User
            int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Really Want To Delete This User","Delete User", JOptionPane.YES_NO_OPTION);
            if(YesOrNo == 0){
               
                if(ps.executeUpdate() != 0){
                   
                    JOptionPane.showMessageDialog(null, "User Deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(C_Users.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}