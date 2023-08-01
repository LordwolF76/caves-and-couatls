package caves_and_couatls.player;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;

public class PlayerCharacter {
    private int level;
    private int experience;
    private int health;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int abilityScorePoints;

    public PlayerCharacter() {
        this.level = 1;
        this.experience = 0;
        this.health = 100;
        this.strength = 10;
        this.dexterity = 10;
        this.constitution = 10;
        this.intelligence = 10;
        this.wisdom = 10;
        this.charisma = 10;
        this.abilityScorePoints = 1;
    }

    // ... (other methods)

    // Getters and Setters for Ability Scores
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    // ... (remaining methods)

    public int getAbilityScorePoints() {
        return abilityScorePoints;
    }

    public void setAbilityScorePoints(int abilityScorePoints) {
        this.abilityScorePoints = abilityScorePoints;
    }

    // ... (rest of the class)
}
