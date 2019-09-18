public class Truth {

    public static void main(String[] args) {

        for (int i = 0; i < 256; i++) {

            int tableNum = i + 1;

            System.out.println("Truth table " + tableNum + ":");
            System.out.println("p q r proposition");
            System.out.println("------------------");

            String binary = (String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0'));

            String one = "F F F ";
            if (binary.charAt(0) == '0') {
                one += "F";
            } else {
                one += "T";
            }

            String two = "F F T ";
            if (binary.charAt(1) == '0') {
                two += "F";
            } else {
                two += "T";
            }

            String three = "F T F ";
            if (binary.charAt(2) == '0') {
                three += "F";
            } else {
                three += "T";
            }

            String four = "F T T ";
            if (binary.charAt(3) == '0') {
                four += "F";
            } else {
                four += "T";
            }

            String five = "T F F ";
            if (binary.charAt(4) == '0') {
                five += "F";
            } else {
                five += "T";
            }

            String six = "T F T ";
            if (binary.charAt(5) == '0') {
                six += "F";
            } else {
                six += "T";
            }

            String seven = "T T F ";
            if (binary.charAt(6) == '0') {
                seven += "F";
            } else {
                seven += "T";
            }

            String eight = "T T T ";
            if (binary.charAt(7) == '0') {
                eight += "F";
            } else {
                eight += "T";
            }

            System.out.println(one);
            System.out.println(two);
            System.out.println(three);
            System.out.println(four);
            System.out.println(five);
            System.out.println(six);
            System.out.println(seven);
            System.out.println(eight);
            System.out.println();

        }// End tablegen loop

        //Proposition 1
        for (int j = 0; j < 8; j++) {

            String propOne = (String.format("%3s", Integer.toBinaryString(j)).replace(' ', '0'));
            char p, q, r;

            if (propOne.charAt(0) == '0') {
                p = 'F';
            } else {
                p = 'T';
            }

            if (propOne.charAt(1) == '0') {
                q = 'F';
            } else {
                q = 'T';
            }
            if (propOne.charAt(2) == '0') {
                r = 'F';
            } else {
                r = 'T';
            }
            System.out.println(p + q);

        } // End Proposition 1
    } //endstuff
    public static char and(char i, char j) {
        if (i == 'T' && j == 'T')
            return 'T';
        else {
            return 'F';
        }
    } // end and

    public static char or(char i, char j) {
        if (i == 'T' || j == 'T')
            return 'T';
        else {
            return 'F';
        }
    }// end or

    public static char not(char i) {
        if (i == 'F')
            return 'T';
        else {
            return 'F';
        }
    }// end not

    public static char cond(char i, char j) {
        if (i == 'T' && j == 'F')
            return 'F';
        else {
            return 'T';
        }
    }// end ifThen

}//End class