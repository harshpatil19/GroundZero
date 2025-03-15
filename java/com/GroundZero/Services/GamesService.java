package com.GroundZero.Services;

import com.GroundZero.DTO.GamesDTO;

public interface GamesService {

	GamesDTO addgames (GamesDTO gamesDto, int gameid );
	GamesDTO updateGames(GamesDTO gamesDto, int gameid);
	void deleteGame(int gameid);
	GamesDTO getAllGames (GamesDTO gamesDto);
	GamesDTO getGamesById(int gameid);
	
}
