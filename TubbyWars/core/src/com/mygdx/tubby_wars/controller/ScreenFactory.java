package com.mygdx.tubby_wars.controller;

import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.Screen;
import com.mygdx.tubby_wars.TubbyWars;
import com.mygdx.tubby_wars.view.CharacterCreationScreen;
import com.mygdx.tubby_wars.view.HighscoreScreen;
import com.mygdx.tubby_wars.view.LoadingScreen;
import com.mygdx.tubby_wars.view.MenuScreen;
import com.mygdx.tubby_wars.view.PlayScreen;
import com.mygdx.tubby_wars.view.SettingScreen;
import com.mygdx.tubby_wars.view.ShopScreen;

public  class ScreenFactory {

    public static TubbyWars game = TubbyWars.getInstance();
    public static Engine engine = new Engine();

    /***
     * THis is a Factory method pattern. All creation of screen objects is handled in this method.
     * The screens are created and return based on the screen type given.
     * @param screenType: String with the type of screen to return.
     * @return: new instance of a screen product.
     */
    public static Screen getScreen(String screenType){
        switch (screenType){
            case "LOADING":
                return new LoadingScreen(game, engine);


            case "SETTINGS":
                return new SettingScreen(game, engine);


            case "HIGHSCORE":
                return new HighscoreScreen(game, engine);


            case "PLAY":
                return new PlayScreen(game, engine);


            case "SHOP":
                return new ShopScreen(game, engine);


            case "MENU":
                return new MenuScreen(game, engine);

            case "CREATE":
                return new CharacterCreationScreen(game);
            default:
                return null;
        }
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
