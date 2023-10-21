package com.mirke.mediamicroservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * <code>Podcast</code> - Podcast Entity (Extends from Media)
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 22/9/23)
 * @version 0.0.1
 */

/**
 * Future changes needed, future gotchas are some things that are transient now might need to be singular or plural.
 */

@Entity
@Table(name = "podcast")
public class Podcast extends Media {

    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------



    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Podcast() {
    }



    // -----------------------------------------------------------------------------------------------------------------
    // Getter & Setters
    // -----------------------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------------------
    // Overwritten Methods
    // -----------------------------------------------------------------------------------------------------------------


}
