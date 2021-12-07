package groupProject2;

public class Registration {  //  Using Ecapulation


    /*
    Create Registration Class in which you would have variables as email,
    userName and password that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods and
    in each method separately pass values to set users email, username and password.

    Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */
    private String email;
    private String userName;
    private String password;
    Registration() {
    }
        public Registration(String email,String userName,String password) {
            setEmail(email);
            setUserName(userName);
            setPassword(password);
        }
        public void setEmail(String email){
        if (email.equals("gmail")) {
            this.email email;
        }else{
            System.out.println(" email is not working properly ");

            public String getUserName() {
                return userName;
            }
            public void setPassword(String passward){
                if (!password.isEmpty() && password.length()> 6) {
                    this.password = password:
                }else{
                    System.out.println("Invalid password ");

                    public String getPasword(){
                        return password;
                    }
                }
            }

        }
    }





}


