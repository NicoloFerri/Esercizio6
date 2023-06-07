package co.develhope.introduction._6;

public class StringHandling {
    public static void main (String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        int a=string2.length();
        int i;

        char[] array1 = new char[4] ;


        for ( i=0 ; i<4 ; i++){
            if  ( i<2 ) {
                array1[i] = string1.charAt(i);
            }else{
                    array1[i]=string2.charAt(a-(4-i));
            }
        }

        System.out.println(array1);
    }
    }

