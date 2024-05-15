package com.mycompany.tp_mekircha_bousdjira_g01;

// Exception personnalisée pour quand l'objectif existe déjà
@SuppressWarnings("serial")
class ObjectifDejaExistantException extends Exception {

	public ObjectifDejaExistantException(String message) {
        super(message);
    }
}