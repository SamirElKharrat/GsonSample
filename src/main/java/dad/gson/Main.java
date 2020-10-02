package dad.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		Persona p = new Persona();
	    
	    System.out.println("Introducir nombre:");
	    p.setNombre(in.nextLine());
	    
	    System.out.println("Introducir Apellido:");
	    p.setApellidos(in.nextLine()); 
	    
	    System.out.println("Introducir Edad:");
	    p.setEdad (in.nextInt());
	    
	    in.close();
	    
	    System.out.println(p.toString());
	    
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        System.out.println(json);

    

	}

}
