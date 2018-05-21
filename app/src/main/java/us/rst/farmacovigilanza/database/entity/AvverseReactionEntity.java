package us.rst.farmacovigilanza.database.entity;

import android.arch.persistence.room.Entity;
import us.rst.farmacovigilanza.models.AvverseReaction;

/**
 * Represents the entity for {@link AvverseReaction}
 */
@Entity(tableName = "avverseReactions")
public class AvverseReactionEntity implements AvverseReaction {
    /**
     * Gets the name of the reaction
     * @return reaction name
     */
    @Override public String getName() {
        return name;
    }

    /**
     * Sets the name of the reaction
     * @param name reaction name
     */
    @Override public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the level of gravity (1-5) of this reaction
     * @return level of gravity (1-5) of this reaction
     */
    @Override public int getLevelOfGravity() {
        return this.levelOfGravity;
    }

    /**
     * Sets the level of gravity (1-5) of this reaction
     * @param levelOfGravity level of gravity of this reaction
     */
    @Override public void setLevelOfGravity(int levelOfGravity) {
        this.levelOfGravity = levelOfGravity;
    }

    /**
     * Gets the description of this reaction
     * @return reaction description
     */
    @Override public String getDescription() {
        return description;
    }

    /**
     * Sets the description of this reaction
     * @param description description reaction
     */
    @Override public void setDescription(String description) {
        this.description = description;
    }

    private String name;
    private int levelOfGravity;
    private String description;
}
