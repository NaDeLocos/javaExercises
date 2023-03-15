package util;

@SuppressWarnings({"unchecked"})

public class Comentario {

    public static <T>void print(T... args){
        for(T arg:args){
            System.out.print(arg);
        }
    }

}
