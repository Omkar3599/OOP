class auto{
     static int method(Integer v){
        return v;
    }
     static float method(Float w){
        return w;
    }
     static double method(Double x){
        return x;
    }
     static char method(Character y){
        return y;
    }
     static boolean  method(Boolean z){
        return z;
    }
     static byte  method(Byte n){
        return n;
    }
}

public class BoxUnbox {
    public static void main(String[] args) {
        Integer i = auto.method(2);
        Float w = auto.method(2.1f);
        Double d = auto.method(2.32);
        Character c= auto.method('s');
        Boolean b = auto.method(true);
        //Byte q = auto.method();

        System.out.println(i+"\t"+w+"\t"+d+"\t"+c+"\t"+b);
        

    }
}
