package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import model.Character;



public class CharacterDao {
	    private static final String FILE_PATH = "/src/main/java/dao/characters.json";
	    private List<Character> characters;
	    
	    public CharacterDao() {
	        characters = loadCharacters();
	    }

	    private List<Character> loadCharacters() {
	    	
	        try {
	            String json = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
	            Character[] characterArray = new Gson().fromJson(json, Character[].class);

	            // Verificar si characterArray es nulo antes de crear la lista
	            if (characterArray != null) {
	                return new ArrayList<>(List.of(characterArray));
	            } else {
	                // Manejar el caso en que characterArray es nulo
	                System.out.println("El array de personajes es nulo.");
	                return new ArrayList<>();
	            }
	        } catch (IOException e) {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	            e.printStackTrace();
	        } catch (JsonSyntaxException e) {
	            System.err.println("Error de sintaxis JSON: " + e.getMessage());
	            e.printStackTrace();
	        } catch (Exception e) {
	            System.err.println("Error desconocido: " + e.getMessage());
	            e.printStackTrace();
	        }
	        return new ArrayList<>();
	    }

	    public void saveCharacter(Character character) {
	        characters.add(character);
	        saveCharacters();
	    }

	    private void saveCharacters() {
	        try (FileWriter writer = new FileWriter(FILE_PATH)) {
	            new Gson().toJson(characters, writer);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void updateBasicAtributeCharacter() {
	    	
	    	try {
	    	Gson gson = new Gson();
	    	String json = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
	    	Character[] characterArray = gson.fromJson(json, Character[].class);
	    	
	    	for(Character character : characterArray) {
	    		if(character.getLevel() == 24) {
	    			character.setLevel(32);
	                // Serializar el array actualizado y escribirlo de 	nuevo en el archivo JSON
	                String updatedJson = gson.toJson(characterArray);
	                Files.write(Paths.get(FILE_PATH), updatedJson.getBytes());
	                
	        		
	    		}
	    		System.out.println(character);
	    		
	    		}
	    		//Actualizar array de personajes local
	    		this.loadCharacters();
	    	
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    }
	    
		public void updateStorageAtributeCharacter(int id, Object updat) {
			
		}
		
		
		
		public List<Character> getCharacters() {
			return characters;
		}

		public void setCharacters(List<Character> characters) {
			this.characters = characters;
		}
		

}
