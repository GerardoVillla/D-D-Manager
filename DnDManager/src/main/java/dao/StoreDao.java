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
import model.Equippable;
import model.Store;

public class StoreDao {
	//ruta del archivo json
	private static final String FILE_PATH = "D:/IGNITER/Documents/Github/D-D-Manager/DnDManager/src/main/java/files/stores.json";
	 private List<Store> stores;
	    
	 
	 	
	    public StoreDao() {
	        stores = loadStores();
	    }
	    
	    
	  //Cargar la lista de tiendas del json
	    private List<Store> loadStores() {
	    	
	        try {
	            String json = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
	            Store[] storeArray = new Gson().fromJson(json, Store[].class);

	            // Verificar si characterArray es nulo antes de crear la lista
	            if (storeArray != null) {
	                return new ArrayList<>(List.of(storeArray));
	            } else {
	                // Manejar el caso en que characterArray es nuloss
	                System.out.println("El array de store es nulo.");
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
	    
	    
	    //Guardar una tienda en el arrayList
	    public void saveStore(Store store) {
	        stores.add(store);
	        saveStores();
	    }

	    private void saveStores() {
	        try (FileWriter writer = new FileWriter(FILE_PATH)) {
	            new Gson().toJson(stores, writer);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    public void updateJsonFile() {
	        try {
	        	saveListCharacters();
	        } catch (Exception e) {
	            System.err.println("Error al actualizar el archivo JSON: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    private void saveListCharacters() {
	        try (FileWriter writer = new FileWriter(FILE_PATH)) {
	            new Gson().toJson(stores, writer);
	        } catch (IOException e) {
	            System.err.println("Error al escribir en el archivo JSON: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
		
	    
	    
	    public List<Store> getStores() {
			return this.stores;
		}

		public void setStores(List<Store> stores) {
			this.stores = stores;
		}
		
		
	
}

