import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        String text = "aldnla ljdal ka 18792795824"
//                + "lad jajna lsf al 13152194393wr eeg";
//        getPhone_13_18(text);
//        testGroup();
        get_email();
    }
    public static void getPhone_13_18(String s){
        Matcher m = Pattern.compile("((13\\d)|(18\\d))\\d{8}").matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
    public static void testGroup(){
        Pattern pattern = Pattern.compile("([a-z]+)([0-9]+)");
        Matcher matcher = pattern.matcher("abc999**bcd8888*bbb0909");

        while (matcher.find()){
            System.out.println(matcher.group()+" "+matcher.group(1)+" "+matcher.group(2));
        }
    }
    public static void get_email(){
        String target = "akuhada584203238@qq.com" +
                "asajbd 187-92795824@163.com.cn" +
                "adake151621@sina.com";

        Pattern pattern = Pattern.compile("[\\d\\-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}");
        Matcher matcher = pattern.matcher(target);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
