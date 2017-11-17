package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.Splash;

public class ZombieGame extends Game {

	public static final String NAME = "ZombieGame", VERSION = "0.0";
	 
	@Override
	public void create() {
		setScreen(new Splash());
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		
	}

	@Override
	public void render() {
		super.render();
		
	}

	@Override
	public void pause() {
		super.pause();
		
	}

	@Override
	public void resume() {
		super.resume();
		
	}

	@Override
	public void dispose() {
		
	}

}
