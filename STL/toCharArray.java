public class toCharArray {
    static public void main(String args[]) {
        String name = "Md Fuadul Islam Redoy";
        char[] ch = name.toCharArray();
        
        //System.out.println(ch.length);

        for (int i = (ch.length)-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        
    }
}