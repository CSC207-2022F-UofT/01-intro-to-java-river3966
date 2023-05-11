
public class test {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        String s = new String("aaa bbb ccc ddd");
        String[] s2 = s.split(" ");


        for (String value : s2) {
            a.append(value.charAt(0));
        }


       System.out.println(a);




    }
}
