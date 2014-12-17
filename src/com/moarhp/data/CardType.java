package com.moarhp.data;

/**
 * Enum of all card classes
 */
public enum CardType {
	// @ryanmr94 I was thinking that this was the colors or something this doesn't seem right for this
	// considering the different functions of these cards it may make more sense to let these be defined by
	// Their subclasses.
	Melee, Ranged, Seige, Magic, Hero
}