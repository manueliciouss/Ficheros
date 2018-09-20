package logica;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author manuel
 */
public class BancoDatos {
    
    private String randNum;
    static final String FILE_NAME = "input.txt";
    
    public String getRandNum() {
        return randNum;
    }
    public static String getFILE_NAME() {
        return FILE_NAME;
    }

    public void setRandNum(String randNum) {
        this.randNum = randNum;
    }
    
    public void leer() {
        
        try{
            
            FileReader input = new FileReader(FILE_NAME);
            int c = input.read();
            String str = "";
            
            while (c != -1) {
                c = input.read();
                char lol = (char)c;
                str += lol;
            }
            System.out.println(str);
            input.close();
            
        } catch (IOException e) {
            System.out.println("Ooops, a ocurrido un error :-)");
        }
    }
    
    public void guardar(String numero) {
        try{
         
            FileWriter output = new FileWriter(FILE_NAME);
            String str = "";
            output.write(numero);
            output.close();
        } catch (IOException e) {
            System.out.println("Ooops, a ocurrido un error :-)");
        }
    }
    public void borrar(){
        
        guardar("             ");
    }
    
    public String NumAzar(int cantidad) {
        String str = "";
        for(int i = 0; i < cantidad; i++){
            int c = ((int)(Math.random() * 9) + 1);
            str += (char)c;
        }
        return str;
    }
}
