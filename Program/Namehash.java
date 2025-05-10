public class Namehash{
    public static String maskEmail(String email){
        email = email.trim();
        String[] parts = email.split("@");
        if(parts.length != 2){
            return email +" Invalid format";
        }

        String local = parts[0];
        String domain = parts[1];
        
        if (local.length() <= 4) {
            return "*".repeat(local.length()) + "@" + domain;
        }
        
        String start = local.substring(0,2);
        String end = local.substring(local.length() -2 );
        String masked = "*".repeat(local.length() -4);

        return start + masked + end + "@" + domain;
    }
    public static void main(String[] args){
        System.out.println(maskEmail("joendeu@gmail.com"));
    }
}