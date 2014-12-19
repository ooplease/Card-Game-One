package com.moarhp.data;

import java.util.ArrayList;
import java.sql.*;

/**
 * Created by Ryan on 12/19/2014.
 */
public class Account {
	private String username;
	private String passwordHash;
	private ArrayList<Card[]> decks;
	private ArrayList<Card> ownedCards;
	//TODO Other information about a given user, such as stats

	public Account(String username, String passwordHash, ArrayList<Card[]> decks, ArrayList<Card> ownedCards){

	}

	public Account createAccount(String username, String password){
		//TODO send request to server to create account
		return null;
	}

	//TODO DELETE THIS BEFORE RELEASE
	public Account createAdminAccount(){
		ArrayList<Card> ownedCards = new ArrayList<Card>();//TODO replace with call to server that retrieves a list of all cards
		ArrayList<Card[]> decks = new ArrayList<Card[]>();
		return new Account("Admin","abc123",decks,ownedCards);
	}
}
