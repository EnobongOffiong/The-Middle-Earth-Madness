package system.management;

import system.characters.MiddleEarthCharacter;

/**
 * Allows CRUD methods for the middle earth characters
 */
public class CharacterManager {
	
private MiddleEarthCharacter[] characters;
private int size; 

/**
 * constructor for CharacterManager for initialization
 */
public CharacterManager() {
    characters = new MiddleEarthCharacter[5];  // Initial capacity
    size = 0;
}

/**
 * adds new character & doubles the array size if it's full 
 * @param c character to be added 
 * @return true if the character addition is successful, else false
 */
public boolean addCharacter(MiddleEarthCharacter c) {
	
	if(c == null) {
		return false;
	}
	
	//doubling array if the array is full 
	if (characters.length == size) {
		int moreSpace = characters.length * 2;
		MiddleEarthCharacter[] array = new MiddleEarthCharacter[moreSpace] ;
		for (int i = 0; i < size; i++) {
			array[i] = characters[i];
		}
		characters = array;
	}
		characters[size] = c;
		size = size+ 1;
		
		return true; 
	
	
}

/** gets a character by their name
 * @param name the character's name that is getting searched 
 * @return the middle earth character if there is a matching name 
 */
public MiddleEarthCharacter getCharacter(String name) {
	
	if (name == null || characters == null) {
        return null;
    }
	
	for (int i = 0; i<characters.length; i++) {
		if (characters[i] != null && characters[i].getName().equalsIgnoreCase(name)) {
			return characters[i];  
		}
	}
	
	return null;  
}

/**
 * updating characters in array 
 * @param character the character that gets updated 
 * @param name the new name to be changed into
 * @param health the new health amount to be changed into 
 * @param power the new power amount to be changed into 
 * @return true if update is successful 
 */
public boolean updateCharacter (MiddleEarthCharacter character, double health, double power) {
	
	if (character == null || characters == null) {
        return false; 
    } 
	
	for (int i = 0; i < characters.length; i++) {
		if (characters[i] != null && characters[i].getName().equalsIgnoreCase(character.getName())) { // Check if this is the character to update
            if (            		
                characters[i].getHealth() == health &&
                characters[i].getPower() == power) {
                	return false; 
            }
      
            characters[i].setHealth(health);
            characters[i].setPower(power);
            return true; 
		} 
	
	}
	return false; // character not found
}


/**
 * removes a character from the array & shifts elements
 * @param character the char that will be deleted 
 * @return true if deletion is successful 
 */
public boolean deleteCharacter(String name) {
	
	if (characters == null) {
	    return false;
	}
	
	for (int i = 0; i < size; i++) {
		if(characters[i].getName()== name ){
			for (int remove = i; remove <size-1; remove++) {
				characters[remove] = characters[remove+1];

			} 
			characters[size - 1] = null;
            size--;
            return true;
		}
		
	}
	return false; //character not found
}

/**
 * displays all the characters in the array 
 */
public void displayAllCharacters() {
	for (int i = 0; i < size; i++) {
        characters[i].displayInfo();
    }
}

/** shows all the characters 
 * @return the array of the characters 
 */
public MiddleEarthCharacter[] getCharacters() {
	return characters;
}


/** setting array 
 * @param characters the array of characters 
 */
public void setCharacters(MiddleEarthCharacter[] characters) {
	this.characters = characters;
}


/** returns the size of the characters 
 * @return how many characters there are 
 */
public int getSize() {
	return size;
}


/**sets the size of the array 
 * @param size the number of characters 
 */
public void setSize(int size) {
	this.size = size;
} 




}
