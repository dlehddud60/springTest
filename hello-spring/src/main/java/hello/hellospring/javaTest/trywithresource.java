package hello.hellospring.javaTest;

import java.io.IOException;
import java.io.InputStreamReader;

public class trywithresource {
    public static void main(String[] args) {
        System.out.println("문자를 입력하세요");
        try (InputStreamReader isr1 = new InputStreamReader(System.in);){
            char input = (char)isr1.read();
            System.out.println("입력 글자 = " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //리소스가 반납이 되어서 더이상 사용할 수 없게 됨
        InputStreamReader isr2 = null;
        try{
            isr2 = new InputStreamReader(System.in);
            char input = (char)isr2.read();
            System.out.println("입력 글자 = " + input);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(isr2!=null){
              try {
                  isr2.close();
              }catch (IOException e) {
                  e.printStackTrace();
              }
            }
        }


    }
}
