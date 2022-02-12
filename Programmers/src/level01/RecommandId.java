package level01;


public class recommand_id {

    public static void main(String[] args) {
        String new_id = "qoWEi324512...rgs11@#rfwe66-_4";
        System.out.println(recommand(new_id));
    }
    
    private static String recommand(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.]{2,}+",".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        if (answer.equals("")) {
            answer += "a";
        }
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("^[.]|[.]$", "");
        }
        if (answer.length() <= 2) {
            while(answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }
        
        return answer;
//        
    }

}
