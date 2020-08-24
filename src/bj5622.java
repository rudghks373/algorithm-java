package rudghks373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class bj5622 {
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        String alText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String[] alTextArr = new String[8];  
        int count = 0;
        int sum = 0;
        br.close();
        
        for(int i=0; i<alTextArr.length; i++) { 
           
            if(i==5 || i==7) {
                alTextArr[i]=alText.substring(count,count+=4);
                continue;
            }
            alTextArr[i]=alText.substring(count,count+=3);         
        } 
        count = 0;
        while(true) { 
            char ch = inputText.charAt(count);
            for(int i=0; i<alTextArr.length; i++) {
                for(int j=0; j<alTextArr[i].length(); j++) {
                    if(ch == alTextArr[i].charAt(j)) {
                        sum += (i+2);
                        count++;
                    }
                }
            }
            if(count == inputText.length()) {
                System.out.println(sum+inputText.length());
                break;
            }
        }
    }
}

