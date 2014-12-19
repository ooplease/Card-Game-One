/**
* A class that defines the common attributes
* and functions of all cards
 */
package com.moarhp.data;

public abstract class Card {
	private String name;
	private int cost;
	private CardType type; //TODO probably remove or replace with color or something like that

	/**
	 * @param   user        the user playing the card
	 * @param   field       the object representing the field in the current game
	 * @param   location    the location for the card to be summoned at
	 * @return              a boolean indicating whether the summon was successful
	 */
	public abstract boolean summon(Account user,/* Field field,*/Position location);
	/*??? unsure if boolean is the proper return type?
	If done this way summon can decide whether or not the action is successful*/
}
