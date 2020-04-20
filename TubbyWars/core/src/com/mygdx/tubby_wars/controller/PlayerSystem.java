package com.mygdx.tubby_wars.controller;


import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.tubby_wars.model.components.PlayerComponent;

public class PlayerSystem extends IteratingSystem {

    private static final Family family = Family.all(PlayerComponent.class).get();
    private ComponentMapper<PlayerComponent> pm;



    public PlayerSystem(){
        super(family);
        pm = ComponentMapper.getFor(PlayerComponent.class);

    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {
        PlayerComponent playerComp = pm.get(entity);
    }


    public void setUsername(Entity playerEntity, String username){
        pm.get(playerEntity).playerName = username;
    }

    public String getUsername(Entity playerEntity){
        return pm.get(playerEntity).playerName;
    }

    public void setScore(Entity playerEntity, int score){
        pm.get(playerEntity).score += score;
    }


    public void setHealth(Entity playerEntity, int health){
        pm.get(playerEntity).health = health;
    }

    public int getHealth(Entity playerEntity){
        return pm.get(playerEntity).health;
    }

    public void dealDamage(Entity playerEntity, int damage){
        pm.get(playerEntity).health -= damage;

    }

    // Set the given weaponEntity to a player
    public void setWeapon(Entity playerEntity, Entity weaponEntity){
        pm.get(playerEntity).weapon = weaponEntity;
    }

    public float getWeaponDamage(Entity playerEntity){
        return pm.get(playerEntity).weaponDamage;
    }

    public void setWeaponDamage(Entity playerEntity, float weaponDamage){
        pm.get(playerEntity).weaponDamage = weaponDamage;
    }

    public void setTexture(Entity playerEntity, Texture texture){
        pm.get(playerEntity).characterBody = texture;
    }

    public Texture getTexture(Entity playerEntity){
        return pm.get(playerEntity).characterBody;
    }

    public void setWeaponTexture(Entity playerEntity, Texture weaponTexture){
        pm.get(playerEntity).weaponTexture = weaponTexture;
    }

    public Texture getWeaponTexture(Entity playerEntity){
        return pm.get(playerEntity).weaponTexture;
    }

}
