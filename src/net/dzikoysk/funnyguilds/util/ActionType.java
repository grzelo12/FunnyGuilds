package net.dzikoysk.funnyguilds.util;

public enum ActionType {
	
	SAVE_DATA,
	
	MYSQL_UPDATE_GUILD_POINTS,
	MYSQL_UPDATE_USER_POINTS,
	
	RANK_UPDATE_USER,
	RANK_UPDATE_GUILD,
	
	PREFIX_UPDATE_GUILD,
	PREFIX_GLOBAL_UPDATE,
	PREFIX_GLOBAL_UPDATE_PLAYER,
	PREFIX_GLOBAL_ADD_PLAYER,
	PREFIX_GLOBAL_ADD_GUILD,
	PREFIX_GLOBAL_REMOVE_PLAYER,
	PREFIX_GLOBAL_REMOVE_GUILD,
	
	PLAYERLIST_SEND,
	PLAYERLIST_GLOBAL_UPDATE;

}
