public class junit {
        public String removeCharacter(String str) {
            String r = str;

            if(str.length()<=2 && str.contains("A"))
                r = str.replace("A","");
            else if(str.contains("A")) {
                String start = str.substring(0,2);
                String end = str.substring(2,str.length());
                r = start.replace("A", "") + end;
            }
            return r;
        }
}
