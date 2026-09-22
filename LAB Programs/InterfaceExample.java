// Week 5
// 5.b Develop a JAVA program to implement Interface. What kind of Inheritance can be achieved?

// First interface
interface Authentication 
{
    void login(String username, String password);
}

// Second interface
interface Database {
    void saveData(String data);
}

// Class implementing both interfaces
/* multiple inheritance can be acheived using interfaces, 
   which is not possible using classes. we can also implement
   single level, multilevel and hierarchial inheritance using interfaces*/ 
class Application implements Authentication, Database 
{
    public void login(String username, String password) 
	{
        System.out.println("User " + username + " logged in with password: " + password);
    }

    public void saveData(String data) {
        System.out.println("Data saved: " + data);
    }
}

// Main class
class Main 
{
    public static void main(String[] args) 
	{
        Application app = new Application();
        app.login("ADMIN", "PASSWORD123");
        app.saveData("USER PROFILE DATA");
    }
}
