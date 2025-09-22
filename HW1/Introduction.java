public class Introduction {
    public static void main(String[] args) {
        String name = "Phạm Công Phát";
        String msv = "24020265";
        String myClass = "QH-2024-I/CQ-I-IT4";
        String userName = "phatpham24";
        String gMail = "24020265@vnu.edu.vn";
        System.out.println(name + '\t' + msv + '\t' + myClass+'\t' + userName + '\t' + gMail);
        String s1 = " bottles of beer on the wall, ";
        String s2 = " bottles of beer. ";
        String s3 = "Take one down, pass it around,";
        for(int i = 9 ; i >= 0 ; i--){
            if(i == 1){
                System.out.println(i +" bottle of beer on the wall, " + i + " bottle of beer. " );
                System.out.println(s3);
            }
            else if(i==0){
                System.out.println(i+s1+i+s2);
                System.out.println("Take one down, pass it around.");
            }
            else {
                System.out.println(i + s1 + i + s2);
                System.out.println(s3);
            }
        }
    }
}